import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = (int)Arrays.stream(array).filter(i -> i == n).count();
        return answer;
    }
}