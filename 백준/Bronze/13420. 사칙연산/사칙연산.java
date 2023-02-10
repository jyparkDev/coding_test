import java.io.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            String[] str = br.readLine().split(" ");
            long num = 0;
            switch (str[1]){
                case "+":
                    num = Long.parseLong(str[0]) + Long.parseLong(str[2]);
                    break;
                case "-":
                    num = Long.parseLong(str[0]) - Long.parseLong(str[2]);
                    break;
                case "*":
                    num = Long.parseLong(str[0]) * Long.parseLong(str[2]);
                    break;
                case "/":
                    num = Long.parseLong(str[0]) / Long.parseLong(str[2]);
                    break;
            }
            if (num == Long.parseLong(str[4])){
                System.out.println("correct");
            }else{
                System.out.println("wrong answer");
            }
        }
    }
}