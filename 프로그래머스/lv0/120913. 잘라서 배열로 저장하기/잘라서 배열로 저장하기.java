import java.util.Arrays;

class Solution{
    public String[] solution(String my_str, int n) {
        int length = my_str.length() % n == 0 ? my_str.length() / n :(my_str.length() / n)+1;
        String[] answer = new String[length];
        int i ;
        for (i = 0; i < my_str.length()/n; i++) {
            answer[i] = my_str.substring(i*n,(i+1)*n);
        }
        if(my_str.length() % n != 0){
            answer[i] = my_str.substring(i*n);;
        }
        return answer;
    }
}