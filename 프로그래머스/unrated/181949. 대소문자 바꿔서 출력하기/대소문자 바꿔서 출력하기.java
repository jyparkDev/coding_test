import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = a.toCharArray();
        for(int i = 0 ; i < ch.length ; i++){
            if('a' <= ch[i] && ch[i] <= 'z'){
                ch[i] -= 32;
            }else{
                ch[i] +=32;
            }
        }
        System.out.print(new String(ch));
    }
}