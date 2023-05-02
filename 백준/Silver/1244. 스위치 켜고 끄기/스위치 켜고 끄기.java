import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] switches = new int[n + 1];
        String[] number = br.readLine().split(" ");
        for (int i = 1; i < switches.length; i++) {
            switches[i] = Integer.parseInt(number[i-1]);
        }
        int stdNum = Integer.parseInt(br.readLine());
        int[][] std = new int[stdNum][2];

        for (int i = 0; i < stdNum; i++) {
            String[] str = br.readLine().split(" ");
            std[i][0] = Integer.parseInt(str[0]);
            std[i][1] = Integer.parseInt(str[1]);
        }

        for (int i = 0; i < stdNum; i++) {
            if (std[i][0] == 1){
                calcMan(std[i][1], switches);
            }else{
                calcWoman(std[i][1], switches);
            }
        }

        for (int i = 1; i < switches.length; i++) {
            System.out.print(switches[i]+ " ");
            if (i % 20 == 0)
                System.out.println();
        }

    }

    static void calcMan(int num, int[] switches){
        for (int i = num; i < switches.length; i+= num) {
            switches[i] = switches[i] == 0 ? 1 : 0;
        }
    }

    static void calcWoman(int num, int[] switches){
        switches[num] = switches[num] == 0 ? 1 : 0;
        for (int i = 1;  0 < num - i && num + i < switches.length; i++) {
            if(switches[num - i] != switches[num + i]) break;

            switches[num - i] = switches[num + i] = switches[num + i] == 0 ? 1 : 0;
        }
    }
}