import java.util.*;
class Solution {
    

    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer,Integer> attackMap = new LinkedHashMap<>();
        int lastAttackPoint = attacks[attacks.length - 1][0];
        int healingTime = bandage[0];
        int healingPerSecond = bandage[1];
        int bonusHealing = bandage[2];
        int currHealth = health;

        for (int i = 0 ; i < attacks.length ; i++){
            attackMap.put(attacks[i][0], attacks[i][1]);
        }

        for(int i = 1, count = 0 ; i <= lastAttackPoint ; i++){
            count++;
            if(attackMap.containsKey(i)){
                currHealth -= attackMap.get(i);
                count = 0;
                if(currHealth <= 0){
                    return -1;
                }
                continue;
            }
            currHealth += healingPerSecond;
            if(count == healingTime){
                currHealth += bonusHealing;
                count = 0;
            }
            currHealth = Math.min(currHealth, health);
        }
        return currHealth;
    }
}