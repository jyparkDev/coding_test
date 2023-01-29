import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                    if(s1.charAt(n) - s2.charAt(n) != 0)
                        return s1.charAt(n) - s2.charAt(n);
                    return s1.compareTo(s2);
            }
        });
        return strings;
    }
}