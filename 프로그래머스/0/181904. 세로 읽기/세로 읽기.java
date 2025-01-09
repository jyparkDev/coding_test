class Solution {
    public String solution(String my_string, int m, int c) {
        
        String[] newStr = new String[my_string.length() / m];
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < newStr.length; i++){
            int startPoint = i * m;
            int endPoint = startPoint + m;
            sb.append(my_string.substring(startPoint, endPoint).charAt(c - 1));
        }
        
        return sb.toString();
    }
}