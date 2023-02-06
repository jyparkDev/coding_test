import java.util.Arrays;

class Solution{
    public int solution(String my_string) {
        String[] str = my_string.replaceAll("[a-zA-z]"," ").strip().split(" ");
        return Arrays.stream(str).filter(s -> s.trim().length() >=1).mapToInt(Integer::parseInt).sum();
    }
}