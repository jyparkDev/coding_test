class Solution {
    public int[] solution(int[] arr) {
        
        int originSize = arr.length;
        
        int targetSize = 1;
        
        while(targetSize < originSize){
            targetSize*=2;
        }
        
        int[] result = new int[targetSize];
        
        for(int i = 0 ; i < arr.length ; i++){
            result[i] = arr[i];
        }
        
        return result;
    }
}