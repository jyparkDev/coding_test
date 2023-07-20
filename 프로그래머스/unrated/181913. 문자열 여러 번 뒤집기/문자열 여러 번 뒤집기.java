class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0 ; i < queries.length ; i++){
            StringBuffer sb  = new StringBuffer();
            String startWord = my_string.substring(0,queries[i][0]);
            String changeWord = sb.append(my_string.substring(queries[i][0],queries[i][1] + 1)).reverse().toString();
            String endWord = my_string.substring(queries[i][1] + 1);
            my_string = startWord + changeWord + endWord;
        }
        return my_string;
    }
}