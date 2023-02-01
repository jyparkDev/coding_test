
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n+1];
        int pt = 0;
        for(int i = 0 ; i < n ; i++){
            String input = br.readLine();

            if (input.startsWith("push")){
                stack[pt++] = Integer.parseInt(input.split(" ")[1]);
            }else if(input.equals("pop")){
                if(pt == 0) System.out.println(-1);
                else{
                    System.out.println(stack[--pt]);
                    stack[pt] = 0;
                }
            }else if(input.equals("size")){
                System.out.println(pt);
            }else if(input.equals("empty")){
                System.out.println(pt == 0 ? 1 : 0);
            }else{
                if(pt == 0 ) System.out.println(-1);
                else{
                    System.out.println(stack[pt-1]);
                }
            }
        }
    }
}
