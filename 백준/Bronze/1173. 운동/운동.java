import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N = s.nextInt(); // 목표 운동시간
        int m = s.nextInt(); // 최소 맥박
        int M = s.nextInt(); // 최대 맥박
        int T = s.nextInt(); // 운동 시 증가 맥박
        int R = s.nextInt(); // 휴식 시 감소 맥박
        int current = m; // 현재 맥박
        int currentN = 0; // 현재까지 운동한 시간
        int result = 0;
        if(m + T > M) {
            System.out.println("-1");
            return;
        }
        do{
            ++result;
            if(current + T <= M){
                currentN++;
                current += T;
            }else{
                current = current - R < m ? m : current - R;
            }

        }while(currentN < N);
        System.out.println(result);
    }
}
