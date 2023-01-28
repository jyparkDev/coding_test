class Solution {
    public String solution(String cipher, int code) {
        int n = 0;
        StringBuilder sb = new StringBuilder();
        while((++n * code -1) < cipher.length())
            sb.append(cipher.charAt(n * code -1));
        return sb.toString();
    }
}