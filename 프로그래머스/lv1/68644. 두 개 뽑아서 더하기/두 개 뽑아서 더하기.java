
class Solution {
    public int[] solution(int[] numbers) {
        int[] check = new int[201];
        int max = 0;
        int num = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int n = numbers[i] + numbers[j];
                check[n]++;
                if (max <= n) max = n;
                if (check[n] == 1) num++;
            }
        }
        int answer[] = new int[num];
        for (int i = 0, k = 0; i <= max; i++){
            if (check[i] > 0) {
                answer[k++] = i;
            }
        }
        return answer;
    }
}