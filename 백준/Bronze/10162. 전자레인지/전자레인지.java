import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] num = {60*5,60*1,10};
        int[] num2 = {0,0,0};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0 ; i < num.length ; i++){
            if(T == 0 )break;
            num2[i] = T / num[i];
            T =  T % num[i];
        }
        if(T != 0) System.out.println(-1);
        else {
            for(int t : num2){
                System.out.print(t + " ");
            }
        }
    }
}