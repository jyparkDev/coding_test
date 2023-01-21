import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        return Long.parseLong(sb.append(String.valueOf(ch)).reverse().toString());
    }
}