import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] current = sc.next().split(":");
        String[] drop = sc.next().split(":");
        int[] currentTime = new int[3];
        int[] dropTime = new int[3];
        for(int i = 0 ; i < 3 ; i++){
            currentTime[i] = Integer.parseInt(current[i]);
            dropTime[i] = Integer.parseInt(drop[i]);
        }
        currentTime[0] *= 3600;
        dropTime[0] *= 3600;
        currentTime[1] *= 60;
        dropTime[1] *= 60;
        if(dropTime[0] - currentTime[0] <= 0){
            dropTime[0] += 24 * 3600;
        }
        int needTimeSecond = 0;
        for(int i = 0 ; i < 3; i++){
            needTimeSecond += dropTime[i] - currentTime[i];
        }

        int hour = needTimeSecond / 3600;
        int minute = (needTimeSecond % 3600) / 60;
        int second = needTimeSecond % 60;

        System.out.printf("%02d:%02d:%02d", hour, minute, second);
     }
}