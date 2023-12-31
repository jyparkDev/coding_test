import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keyDelay = sc.nextInt();
        int duplicateKeyDelay = sc.nextInt();
        sc.nextLine();
        String[] word = sc.nextLine().split("");
        String[] dialog = {"", " ", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int time = 0; // 소요 시간
        int lastKeyNum = 0;

        for (String s : word) {
            for(int i = 1 ; i < dialog.length ; i++){
                if(dialog[i].contains(s)){
                    time += (dialog[i].indexOf(s) + 1) * keyDelay;
                    if (i == lastKeyNum && lastKeyNum != 1){
                        time += duplicateKeyDelay;
                    }
                    lastKeyNum = i;
                    break;
                }
            }
        }
        System.out.println(time);

    }
}
