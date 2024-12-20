class Solution {
    public int solution(int[] sides) {
        
        int idx = sides[0] >= sides[1] ? sides[0] : sides[1];
        int sum = sides[0] + sides[1];
        int count = 0; 
        
        for(int i = 1 ; ; i++){
            if(i > idx && i >=sum){
                break;
            }
            if(i <= idx && (i + (sum - idx) > idx)){
                count++;
                continue;
            }
            if(i > idx && (sum > i)){
                count++;
                continue;
            }
        }

        return count;
    }
}