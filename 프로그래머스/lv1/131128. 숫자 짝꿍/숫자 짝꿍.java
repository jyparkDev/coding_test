
class Solution {
    public String solution(String X, String Y) {
        int[] xNum = new int[10];
        int[] yNum = new int[10];
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < X.length() ;i++){
            xNum[X.charAt(i) - '0']++;
        }
        for (int i = 0; i < Y.length() ;i++){
            yNum[Y.charAt(i) - '0']++;
        }
        for(int i = 9 ; i >= 0 ; i--){
            if(xNum[i] != 0 && yNum[i] != 0){
                int num = Math.min(xNum[i], yNum[i]);
                for(int j = 0 ; j < num ; j++){
                    buffer.append(i);
                }
            }
        }
        if (buffer.length() == 0){
            return "-1";
        } else if (buffer.toString().charAt(0) == '0') {
            return "0";
        }else{
            return buffer.toString();
        }
    }
}