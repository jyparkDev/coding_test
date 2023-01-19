package programmers.lv1;

import java.util.Arrays;

/**
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 */
public class Knum {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int num[] = new int[commands.length];
        for(int a = 0 ; a < num.length ;a++){
            int[] temp = commands[a];
            int[] splitArr = Arrays.copyOfRange(array,temp[0]-1,temp[1]);
            Arrays.sort(splitArr);
            num[a] = splitArr[temp[2]-1];
        }
    }
}
