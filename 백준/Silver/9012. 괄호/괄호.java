import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        Stack<String> st ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < n ; i++){
            String[] str = br.readLine().split("");
            st = new Stack<>();
            for(String s : str){
                if(s.equals("(")) st.push("(");
                else {
                    if(st.size() == 0) {
                        st.push(")"); break;
                    }else{
                        st.pop();
                    }
                }
            }
            if(st.size() == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
