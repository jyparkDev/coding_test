class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0 ; i < queries.length ; i++){
            int[] tmp = queries[i];
            for(int j = tmp[0] ; j <= tmp[1] ; j++){
                arr[j]++;
            }
        }
        return arr;
    }
}