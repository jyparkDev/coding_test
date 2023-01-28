import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = n; i > 0 ; i--){
            String pwd = s.next();
            if(6<=pwd.length() && pwd.length() <= 9)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}