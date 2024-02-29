class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int sumLength = pat.length();
        
        for(int i = 0 ; i + sumLength <= myString.length(); i++){
            if(myString.substring(i , i + sumLength).equals(pat)){
                count++;
            }
        }
        
        return count;
    }
}