class Solution {
    public int solution(int a, int b) {
        String str = String.valueOf(a) + String.valueOf(b);
        int strInt = Integer.parseInt(str);
    
        return Math.max(strInt, 2 * a * b);
    }
}