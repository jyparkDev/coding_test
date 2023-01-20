package programmers.lv0;

import java.util.Arrays;

public class _120833 {

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }

    public static void main(String[] args) {
        System.out.println("Main.main");
        int[] result = solution(new int[]{1, 2, 3, 4, 5},1,3);
        System.out.println("result = " + Arrays.toString(result));
    }
}
