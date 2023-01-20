package programmers.lv0;

import java.util.Arrays;

public class _120821 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0,j= num_list.length-1; i <= num_list.length / 2 ; i++,j--){
            answer[i] = num_list[j];
            answer[j] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Main.main");
        int[] result = solution(new int[]{1, 5, 1, 2, 1, 3});
        System.out.println("result = " + Arrays.toString(result));
    }
}
