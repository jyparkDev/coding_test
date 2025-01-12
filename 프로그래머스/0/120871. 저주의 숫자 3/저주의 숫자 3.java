class Solution {
    public int solution(int n) {
        int[] list = new int[101];
        int idx = 1;
        int num = 1;
        
        while(idx <= 100){
            if( num % 3 == 0 || (num + "").indexOf("3") != -1){
                num++;
                continue;
            }
            list[idx++] = num++;
        }
        

        return list[n];
    }
}