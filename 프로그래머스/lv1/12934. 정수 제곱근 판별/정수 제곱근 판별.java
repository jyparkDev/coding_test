class Solution {
    public long solution(long n) {
        double result = Math.sqrt(n);
        long answer = (long)result;
        return answer == result ? (long)Math.pow(answer+1,2) : -1;
    }
}