class Solution {
    public String solution(String my_string, int[] indices) {
        char[] chars = my_string.toCharArray();
        for(int n : indices){
            chars[n] = ' ';
        }
        return new String(chars).replace(" ","");
    }
}