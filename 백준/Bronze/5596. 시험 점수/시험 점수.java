import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] totalScore = new int[8];
        for(int i = 0 ; i < totalScore.length ; i++){
            totalScore[i/4] += sc.nextInt();
        }
        if(totalScore[0]>=totalScore[1])
            System.out.print(totalScore[0]);
        else
            System.out.print(totalScore[1]);
    }
}