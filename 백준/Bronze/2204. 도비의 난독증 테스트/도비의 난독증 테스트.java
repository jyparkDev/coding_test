

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int N = sc.nextInt();
            if (N == 0){
                break;
            }
            sc.nextLine();
            String std = "";
            String target = "";
            for(int i = 0 ; i < N ; i++){
                target = sc.nextLine();

                if (std.equals("")){
                    std = target;
                    continue;
                }
                std = target.toLowerCase().compareTo(std.toLowerCase()) < 0 ? target : std;
            }
            System.out.println(std);
        }
    }
}
