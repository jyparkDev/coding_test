class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        
        for (String s : babbling) {
            String cur = "";
            while (true){
                if(s.startsWith("aya") && !cur.equals("aya")){
                    s = s.replaceFirst("aya","");
                    cur = "aya";
                } else if(s.startsWith("ye") && !cur.equals("ye")){
                    s = s.replaceFirst("ye","");
                    cur = "ye";
                } else if( s.startsWith("woo") && !cur.equals("woo")){
                    s = s.replaceFirst("woo","");
                    cur = "woo";
                } else if(s.startsWith("ma") && !cur.equals("ma")){
                    s = s.replaceFirst("ma","");
                    cur = "ma";
                } else{
                    if(s.length() == 0){
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}