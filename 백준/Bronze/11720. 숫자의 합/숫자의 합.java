import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        s.nextLine();
        char[] num = s.nextLine().toCharArray();
        int sum = 0;
        for(int i = 0 ; i < num.length; i++){
            sum += num[i] - '0';
        }
        System.out.println(sum);
    }
}