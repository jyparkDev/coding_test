import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int i = 0;
        int length = str_list.length;
        while (i < length){
            if (str_list[i].equals("l")){
                return Arrays.copyOfRange(str_list,0, i);
            }
            if (str_list[i].equals("r")){
                return Arrays.copyOfRange(str_list, i + 1, length);
            }
            i++;
        }
        return new String[0];
    }
}