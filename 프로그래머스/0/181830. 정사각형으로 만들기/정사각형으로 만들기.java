class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int n = row < col ? row : col;
        int m = row > col ? row : col;
        
        int[][] matrix = new int[m][m];

       for (int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < col ; j++){
                matrix[i][j] = arr[i][j];
            }
        }

        return matrix;
    }
}