package programmers.lv0;

import java.util.Arrays;

public class _120817 {
    public static double solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);

        return Arrays.stream(numbers).average().getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println("Main.main");
        double result = solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println("result = " + result);
    }
}
