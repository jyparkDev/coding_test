import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int totalMoney = 0;
        Map<Integer,Integer> map;
        for(int i = 0 ; i < n ; i++){
            map = new HashMap<>();
            int money = 0;
            int max = 0;
            for(int j = 0 ; j < 3 ; j++){
                int a = s.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            Iterator iter = map.keySet().iterator();
            while (iter.hasNext()){
                int tmp = (int)iter.next();
                int num = map.get(tmp);
                if(num >= 2){
                    if(num == 3)
                        money = 10000 + (tmp*1000);
                    else
                        money = 1000 + (tmp*100);
                    break;
                }
                if(tmp > max) max = tmp;
            }
            if(map.size() == 3) money = max * 100;
            if(money >= totalMoney) {
                totalMoney = money;
            }
        }
        System.out.println(totalMoney);
    }
}