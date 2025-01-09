class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int length = board[0].length;
        // 위 -> 우 -> 아래 -> 좌 순서로 순회
        int[] dh = {-1, 0 , 1 ,0};
        int[] dw = {0, 1, 0 , -1};
        
        int count = 0;
        
        String color = board[h][w];
        
        for(int i = 0 ; i < dh.length ; i++){
            int h_check = dh[i] + h;
            int w_check = dw[i] + w;
            if( !(0 <= h_check && h_check < length) 
               || !(0 <= w_check && w_check < length)){
                continue;
            }
            
            if(color.equals(board[h_check][w_check])){
                ++count;
            }
        }

        return count;
    }
}