import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replaceAll("[^[a|e|i|o|u]]","");
        System.out.print(str.length());
        
    }
}