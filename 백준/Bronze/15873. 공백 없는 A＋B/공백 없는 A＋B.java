import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int a = 0 , b = 0;

        if(str.length() <= 2){
            a = Integer.parseInt(str.substring(0,1));
            b = Integer.parseInt(str.substring(1));
        }else if( str.length() > 3){
            a = Integer.parseInt(str.substring(0,2));
            b = Integer.parseInt(str.substring(2));
        }else{
            if( Integer.parseInt(str.substring(0,2)) == 10){
                a = 10;
                b = Integer.parseInt(str.substring(2));
            }else{
                b = 10;
                a = Integer.parseInt(str.substring(0,1));
            }

        }

        System.out.println(a + b);
    }
}