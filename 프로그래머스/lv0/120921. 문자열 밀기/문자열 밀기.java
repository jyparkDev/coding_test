class Solution {
    public int solution(String A, String B) {
        if (A.equals(B)) return 0;
        int i = 0;
        while (i<A.length()){
            i++;
            B = B.substring(1)+B.substring(0,1);
            if(A.equals(B)) return i;
        }
        return -1;
    }
}