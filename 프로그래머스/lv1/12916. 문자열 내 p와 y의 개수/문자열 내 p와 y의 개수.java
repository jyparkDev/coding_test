class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        return s.replaceAll("[^y]","").length() == s.replaceAll("[^p]","").length() 
            ? true 
            : false;
    }
}