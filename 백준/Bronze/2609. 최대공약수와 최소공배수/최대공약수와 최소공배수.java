import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int num = Main.gcd(a,b);
        System.out.println(num);
        System.out.println(a*b/num);
    }
    static int gcd(int a, int b){
        while(b>0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}