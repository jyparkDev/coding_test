import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().replace(" ", "").toCharArray();

        String result = ch[0] == '1' ? "ascending" : ch[0] == '8' ? "descending" : "mixed";
        char target = ch[0];
        if (!result.equals("mixed")){
            for(int i = 1 ; i < ch.length ; i++){
                if(Math.abs(ch[i] - target) != 1){
                    result = "mixed";
                    break;
                }
                target = ch[i];
            }
        }

        System.out.println(result);
    }
}