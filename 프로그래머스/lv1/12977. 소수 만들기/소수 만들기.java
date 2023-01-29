class Solution {
   private static final boolean[] sp = new boolean[3000+1];

    public static void check(){
        for(int i = 2 ; i <= 3000 ; i++){
            for(int j = i ; i * j <= 3000; j++){
                sp[i*j] = true;
            }
        }
    }
    public static int solution(int[] nums) {
        check();
        int answer = 0;
        for(int i = 0,j=1,k=2 ; i < nums.length - 2;){
            if(k == nums.length){
                ++j;
                if(j == nums.length-1){
                    i++; j = i+1;
                }
                k = j+1;
                continue;
            }
            if(!sp[nums[i]+nums[j]+nums[k]]) answer++;
            k++;
        }
        return answer;
    }
}