class Solution {
    public int[] solution(int start, int end) {
        int[] arr = new int[start - end + 1];
        for(int i = start,idx = 0 ; idx < arr.length ; i--,idx++){
            arr[idx] = i;
        }
        return arr;
    }
}