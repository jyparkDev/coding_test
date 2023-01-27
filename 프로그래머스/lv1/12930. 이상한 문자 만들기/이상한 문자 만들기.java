class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c == ' ') {
                sb.append(" ");
                check = false;
            }else{
                if(!check)
                    sb.append((""+c).toUpperCase());
                else
                    sb.append((""+c).toLowerCase());
                check = !check;
            }
        }
        return sb.toString();
    }
}