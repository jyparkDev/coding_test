import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean seat[] = new boolean[100];
        int num = 0;
        for (int i = 0 ; i < n ; i++){
            int a = s.nextInt();
            if(seat[a-1]){
                num++;
            }else {
                seat[a-1] = true;
            }
        }
        System.out.println(num);
    }
}
