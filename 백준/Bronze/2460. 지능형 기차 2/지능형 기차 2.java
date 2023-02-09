import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 10;
        Scanner s = new Scanner(System.in);
        int currenNum = 0;
        int maxNum = 0;
        int up = 0,down = 0;
        while (n-- > 0 ){
            down = s.nextInt();
            up = s.nextInt();
            currenNum += (up-down);
            if(currenNum>=maxNum )
                maxNum = currenNum;
        }
        System.out.println(maxNum);
    }
}
