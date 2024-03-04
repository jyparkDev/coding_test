import java.util.ArrayList;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[] arr[] = new int[100][2];
        int count = 0;

        for (int i = 0 ; i < attendance.length ; i++){
            if (attendance[i]){
                arr[count][0] = rank[i];
                arr[count++][1] = i;
            }
        }

        for (int i = 0 ; i < count - 1; i++){
            for(int j = i + 1 ; j < count ; j++){
                if (arr[j][0] < arr[i][0]){
                    int temp[] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        

        return calculate(arr[0][1],arr[1][1],arr[2][1]);
    }
    
    public int calculate(int a , int b , int c){
        return (10000 * a) + (100 * b) + c;
    }
}