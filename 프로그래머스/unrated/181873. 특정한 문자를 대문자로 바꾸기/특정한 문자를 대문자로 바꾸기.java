class Solution {
    public String solution(String my_string, String alp) {
        String word = alp.toUpperCase();
        
        return my_string.replaceAll(alp,word);
    }
}