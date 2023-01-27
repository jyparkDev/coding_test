class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        if(n%2==0) sb.append("수박".repeat(n/2));
        else sb.append("수박".repeat(n/2)+"수");
        return sb.toString();
    }
}