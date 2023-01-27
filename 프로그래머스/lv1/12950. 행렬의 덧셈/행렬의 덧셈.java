class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] answer = new int[rows][cols];
        for(int i = 0; i < rows * cols ; i++)
            answer[i/cols][i%cols] = arr1[i/cols][i%cols] + arr2[i/cols][i%cols];
        
        return answer;
    }
}