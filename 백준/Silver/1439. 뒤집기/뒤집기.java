import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] ch = s.next().toCharArray();
        boolean sw = false;
        char init = ch[0];
        int count = 0;
        for(int i = 1 ; i < ch.length; i++){
            if(init != ch[i]){
                if(!sw){
                    sw = true;
                    ++count;
                }
            }else{
                sw = false;
            }
        }
        System.out.println(count);
    }
}
