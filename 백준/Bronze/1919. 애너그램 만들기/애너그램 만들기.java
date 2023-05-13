import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] tmp = a.toCharArray();

        for (char c : tmp) {
            if( b.indexOf(c) != -1){
                a = a.replaceFirst(""+c,"");
                b = b.replaceFirst(""+c,"");
            }
        }
        System.out.println(a.length()+b.length());
    }
}