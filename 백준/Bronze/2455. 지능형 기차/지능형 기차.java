import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int result = 0;
        int culNum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 4 ; i++){
            int down = sc.nextInt();
            int up = sc.nextInt();
            if(up > down){
                culNum += (up-down);
            }else{
                culNum -= (down-up);
            }
            result = result >= culNum ? result : culNum;
        }
        System.out.println(result);
    }
}