class Solution {
    public int solution(int[][] dots) {
        
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        
        for(int i = 1 ; i < 4 ; i++){
            
            double d = (Math.abs(dots[i][1] - y1)) / (double) (Math.abs( dots[i][0] - x1));
            
            if( i == 1){
                if (d == (Math.abs(dots[3][1] - dots[2][1])) / (double) (Math.abs( dots[3][0] - dots[2][0] ))){
                    return 1;
                }
            } else if (i == 2){
                if (d == (Math.abs(dots[3][1] - dots[1][1])) / (double) (Math.abs( dots[3][0] - dots[1][0] ))){
                    return 1;
                }
            } else {
                if (d == (Math.abs(dots[2][1] - dots[1][1])) / (double) (Math.abs( dots[2][0] - dots[1][0] ))){
                    return 1;
                }
            }
        }
        
        return 0;
    }
}