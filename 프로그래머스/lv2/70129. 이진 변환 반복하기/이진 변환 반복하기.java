class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")){
            answer[0]++; // 반복횟수
            answer[1] += s.replaceAll("1","").length(); // 0 개수
            int tmp = s.replaceAll("0","").length();
            s = Integer.toBinaryString(tmp);
        }
        return answer;
    }
}