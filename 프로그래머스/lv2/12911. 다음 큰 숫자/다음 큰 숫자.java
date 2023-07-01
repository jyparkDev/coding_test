class Solution {
    public int solution(int n) {
        String targetN = Integer.toBinaryString(n).replace("0","");
        while (++n <= 1000000){
            if(targetN.length() == Integer.toBinaryString(n).replace("0","").length()){
                return n;
            }
        }
        return 0;
    }
}