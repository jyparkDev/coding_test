class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int i = 0;
        for(String s : quiz){
            String data[] = s.split(" ");
            switch(data[1]){
                case "+":
                    if(Integer.parseInt(data[0]) + Integer.parseInt(data[2]) == Integer.parseInt(data[4])){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                    break;
                case "-":
                    if(Integer.parseInt(data[0]) - Integer.parseInt(data[2]) == Integer.parseInt(data[4])){
                        answer[i] = "O";
                    }else{
                        answer[i] = "X";
                    }
                    break;
            }i++;
        }
        return answer;
    }
}