import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list) {
        // int[] answer = new int[2];
        // for(int i = 0 ; i < num_list.length ; i++){
        //     answer[num_list[i] % 2]++;
        // }
        // answer[0] = (int)Arrays.stream(num_list).filter(i-> i % 2 == 0).count();
        // answer[1] = (int)Arrays.stream(num_list).filter(i-> i % 2 == 1).count();
        return IntStream
                .of((int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count(),(int) Arrays.stream(num_list).filter(i -> i % 2 != 0).count())
                .toArray();
    }
}