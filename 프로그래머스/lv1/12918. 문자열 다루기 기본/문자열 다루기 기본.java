class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6)
            return s.replaceAll("[a-zA-Z]","*").contains("*") ? false : true;
        return false;
    }
}