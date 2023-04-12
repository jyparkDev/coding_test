import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = s.nextInt();
        
        System.out.print(str.charAt(n-1));
    }
}