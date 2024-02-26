class Solution {
    public String solution(int[] numLog) {
        int cur = numLog[0];
        StringBuffer st = new StringBuffer();
        for(int i = 1 ; i < numLog.length ; i++){
            int target = numLog[i];
            if( cur + 1 == target){
                st.append("w");
                cur += 1;
            }else if( cur - 1 == target){
                st.append("s");
                cur -= 1;
            }else if( cur + 10  == target){
                st.append("d");
                cur += 10;
            }else if( cur - 10 == target){
                st.append("a");
                cur -= 10;
            }
        }
        return st.toString();
    }
}