class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.split("");
        boolean empty = true;
        for (String str : strArr) {
            if(str.equals(" ")){
                empty = true;
                sb.append(" ");
            }
            else if(empty){
                char ch = str.charAt(0);
                if(!(0 <= ch -'0' && ch - '9'<=0)){
                    sb.append(str.toUpperCase());
                }else {
                    sb.append(str);
                }
                empty = false;
            }else{
                sb.append(str.toLowerCase());
                empty = false;
            }
        }
        return sb.toString();
    }
}