import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0 ; i < n ; i++){
            int in = sc.nextInt();
            if(in == 0) st.pop();
            else{
                st.push(in);
            }
        }
        while (st.size()>0){
            result += st.pop();
        }
        System.out.println(result);
    }
}
