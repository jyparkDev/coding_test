import java.util.Arrays;


class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        char[][] board = make(park,answer);

        for (int i = 0 ; i < routes.length ; i++){
            String[] r = routes[i].split(" ");
            int distance = Integer.parseInt(r[1]);
            boolean check = true;
            if( r[0].equals("N") || r[0].equals("S")){
                int position = answer[0];
                int d = r[0].equals("N") ? -1 : 1;
                for(int j = 0 ; j < distance ; j++){
                    position += d;
                    if(position < 0 || position >= board.length || board[position][answer[1]] == 'X'){
                        check = false;
                        break;
                    }
                }
                if (check){
                    answer[0] += distance * d;
                }
            }else{
                int position = answer[1];
                int d = r[0].equals("W") ? -1 : 1;
                for(int j = 0 ; j < distance ; j++){
                    position += d;
                    if(position < 0 || position >= board[answer[0]].length || board[answer[0]][position] == 'X'){
                        check = false;
                        break;
                    }
                }
                if (check){
                    answer[1] += distance * d;
                }
            }
        }

        return answer;
    }

    static char[][] make(String[] park,int[] answer){
        char[][] board = new char[park.length][];
        for (int i = 0; i < park.length; i++) {
            board[i] = park[i].toCharArray();
            if (park[i].indexOf('S') != -1){
                answer[0] = i;
                answer[1] = park[i].indexOf('S');
            }
        }
        return board;
    }
}
