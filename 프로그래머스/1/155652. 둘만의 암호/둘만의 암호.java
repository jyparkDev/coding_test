class Solution {
    public String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer();
        boolean[] check = new boolean[26];
        
        for(int i = 0 ; i < skip.length();i++){
            check[skip.charAt(i) - 'a'] = true;
        }
        
        for(int i = 0 ; i < s.length(); i++){
            int idx = s.charAt(i) - 'a';
            
            int next = 1;
            
            while(next <= index){
                idx = idx + 1 == 26 ? 0 : idx + 1; 
                if(!check[idx]){
                    ++next;
                }
            }
            sb.append((char)('a' + idx));
        }
        
        
        return sb.toString();
    }
}