/*
    2->0
    0->5
    5->2
*/
import java.util.Arrays;
class Solution {
    public String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char a : arr)
            sb.append(a == '2' ? '0' : a=='0' ? '5' : '2');
        return sb.toString();
    }
}