import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int num[] = new int[commands.length];
        for(int a = 0 ; a < num.length ;a++){
            int[] temp = commands[a];
            int i = temp[0], j = temp[1], k = temp[2];
            int[] splitArr = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(splitArr);
            num[a] = splitArr[k-1];
        }
        return num;
    }
}