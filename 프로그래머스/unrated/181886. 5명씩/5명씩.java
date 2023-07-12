class Solution {
    public String[] solution(String[] names) {
        int n = names.length / 5;
        n += names.length % 5 > 0 ? 1 : 0;
        String[] answer = new String[n];
        for(int i = 0,idx = 0 ; i < names.length ; i += 5){
            answer[idx++] = names[i];
        }
        return answer;
    }
}