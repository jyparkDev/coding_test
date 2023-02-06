class Solution{
    public int[] solution(String[] keyinput, int[] board) {
        int upDown  = board[1] / 2;
        int leftRigth = board[0] / 2;
        int[] answer = new int[2];
        for(String move : keyinput){
            switch (move){
                case "left":
                    answer[0] += answer[0] -1 < -leftRigth ? 0 :  -1;
                    break;
                case "right":
                    answer[0] += answer[0] +1 > leftRigth ? 0 : 1;
                    break;
                case "down":
                    answer[1] += answer[1] -1 < -upDown ? 0 :  -1;
                    break;
                case "up":
                    answer[1] += answer[1] + 1 > upDown ? 0 :  1;
                    break;
            }
        }
        return answer;
    }
}