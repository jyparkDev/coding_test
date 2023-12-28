import java.util.Scanner;

class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int targetSec = 0;
        int dateToSec = 24 * 60 * 60;
        int[] startTime = new int[3];

        for (int i = 0 ; i < startTime.length ; i++){
            startTime[i] = sc.nextInt();
        }

        targetSec = sc.nextInt();

        int sumSec = (startTime[2]) + (startTime[1] * 60) + (startTime[0] * 60 * 60) + targetSec;
        int resultSec = sumSec % dateToSec;
        System.out.print(resultSec / (60*60));
        resultSec %= (60 * 60);
        System.out.print(" " + (resultSec / 60));
        resultSec %= 60;
        System.out.print(" " + resultSec);
    }
}