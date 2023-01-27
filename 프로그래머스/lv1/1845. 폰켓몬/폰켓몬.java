import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int num = nums.length / 2;
        Map<Integer,Integer> poketMap = new HashMap<>();
        for(int num2 : nums) poketMap.put(num2,1);
        return poketMap.size() >= num ? num : poketMap.size();
    }
}