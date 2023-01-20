class Solution {
    public int solution(String s) {
        int answer = 0;
        int sp = 0;
        String strArr[] = s.split(" ");
        for(int i = 0,tmp = 0 ; i < strArr.length ; i++){
            if(!strArr[i].equals("Z"))
                answer += sp = tmp = Integer.parseInt(strArr[i]);
            else
                answer -= sp;
        }
        return answer;
    }
}