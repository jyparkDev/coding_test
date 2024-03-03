class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String menu : order){
            if(menu.contains("cafelatte")){
                answer+= 5000;
                continue;
            }
            answer += 4500;
        }
        return answer;
    }
}