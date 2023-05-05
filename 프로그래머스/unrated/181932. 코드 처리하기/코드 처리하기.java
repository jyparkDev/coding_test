class Solution {
    public String solution(String code) {
        StringBuffer ret = new StringBuffer();
        char[] codes = code.toCharArray();
        int mode = 0;

        for (int i = 0; i < codes.length; i++) {
            char c = codes[i];
            if( codes[i] == '1'){
                mode = mode == 0 ? 1 : 0;
            } else if((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)){
                ret.append(c);
            } 
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}