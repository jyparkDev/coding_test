class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int num = 0;
        for(String s : picture){
            char[] ch = s.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(char c : ch){
                for(int i = 0 ; i < k ; i++){
                    sb.append(c);
                }
            }
            
            for(int i = 0 ; i < k ; i++){
                answer[num++] = sb.toString();
            }
            
        }
        return answer;
    }
}