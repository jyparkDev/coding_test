class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer sb = new StringBuffer();
        
        for(int i = r; i < code.length() ; i += q){
            sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}