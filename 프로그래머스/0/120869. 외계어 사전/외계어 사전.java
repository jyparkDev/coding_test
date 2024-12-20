class Solution {
    public int solution(String[] spell, String[] dic) {

        
        for(String s : dic){
            boolean flag = true;
            for(String c : spell){
                if(s.indexOf(c) == -1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return 1 ;
            }
        }

        return 2;
    }
}