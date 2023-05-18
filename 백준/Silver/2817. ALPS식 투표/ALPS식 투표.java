import java.util.Scanner;

public class Main {
    static class Score{
        int staffIndex;
        double src;

        public Score(int staffIndex, double src) {
            this.staffIndex = staffIndex;
            this.src = src;
        }
    }

    public static void sortScoresDescendingOrder(Score[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < i ; j++){
                if(arr[i].src > arr[j].src){
                    Score cur = arr[i];
                    for(int k = i; k > j ; k--){
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = cur;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 참가자 수
        int X = sc.nextInt();
        // 스태프 수
        int N = sc.nextInt();

        double cut = X * 0.05;
        boolean[] validCandidate = new boolean[26];
        int[] staffVote = new int[26];
        int canditeCount = 0;

        for (int i = 0 ; i < N ; i++){
            String name = sc.next();
            int vote = sc.nextInt();

            if (vote >= cut){
                int index = name.charAt(0) - 'A';
                validCandidate[index] = true;
                staffVote[index] = vote;
                canditeCount++;
            }
        }

        Score[] scores = new Score[14 * canditeCount];
        int scoreIndex = 0;
        for(int i = 0 ; i < 26  ; i++)
            if(validCandidate[i])
                for(int j = 1 ; j <= 14 ; j++)
                    scores[scoreIndex++] = new Score(i, (double) staffVote[i] / j);


        sortScoresDescendingOrder(scores);

        int[] ans = new int[26];
        for(int i = 0 ; i < 14 ; i++){
            ans[scores[i].staffIndex]++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(validCandidate[i])
                System.out.println((char)(i + 'A') + " " + ans[i]);
        }
    }
}

