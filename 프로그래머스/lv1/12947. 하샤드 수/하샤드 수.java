class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xx = String.valueOf(x);
        int num = 0;
        for(int i = 0 ; i < xx.length(); i++)
            num += xx.charAt(i) - '0';
        return x % num == 0 ? true : false;
    }
}