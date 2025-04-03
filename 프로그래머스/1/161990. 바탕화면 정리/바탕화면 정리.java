class Solution {
    public int[] solution(String[] wallpaper) {
        // lux, luy, rdx, rdy

        int[] answer = {-1,-1,-1,-1};
        char[][] board = new char[wallpaper.length][wallpaper[0].length()];

        for(int i = 0 ; i < wallpaper.length ; i++){
            board[i] = wallpaper[i].toCharArray();
        }
        
                for (int x = 0 ; x < board.length ; x++){
            for (int y = 0 ; y < board[x].length; y++){
                if(board[x][y] == '#'){
                    answer[0] = answer[0] == -1 ? x : Math.min(x, answer[0]);
                    answer[1] = answer[1] == -1 ? y : Math.min(y, answer[1]);
                    answer[2] = Math.max(x, answer[2]);
                    answer[3] = Math.max(y, answer[3]);
                }
            }
        }

        answer[2]++;
        answer[3]++;
        
        return answer;
    }
}

