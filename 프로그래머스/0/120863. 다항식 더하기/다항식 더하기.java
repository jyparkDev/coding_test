class Solution {
    public String solution(String polynomial) {
        
        String[] arr = null;
        int one = 0;
        int zero = 0;
        
        if(!polynomial.contains("+")){
            arr = new String[1];
            arr[0] = polynomial;
        } else {
            arr = polynomial.replaceAll(" ", "").split("[+]");
        }
            

        
        for(String str : arr){
            if(str.indexOf("x") != -1){
                one += str.length() == 1 ? 1 : Integer.parseInt(str.replace("x",""));
            } else {
                zero += Integer.parseInt(str);
            }
        }
        
        if( one > 0 && zero > 0){
            if( one == 1){
                return "x + " + zero;
            } else {
                return one + "x + " + zero;
            }
        } else if( one == 0 && zero > 0){
            return "" + zero;
        } else {
            return one == 1 ? "x" : one + "x";
        }

    }
}