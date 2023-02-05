import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = "";
        int result = 0;
        char[] ch ;
        while (!(in = s.next()).equals("0")){
            result = (2 + in.length()-1);
            ch = in.toCharArray();
            for (char c : ch) {
                if(c-'0' == 0) result+=4;
                else if(c-'0' ==1) result +=2;
                else result +=3;
            }
            System.out.println(result);
        }
    }
}