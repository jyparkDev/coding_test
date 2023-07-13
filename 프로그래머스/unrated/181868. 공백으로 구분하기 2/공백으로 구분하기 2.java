class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.strip().replaceAll("[' ']+"," ");
        
        return my_string.split(" ");
    }
}