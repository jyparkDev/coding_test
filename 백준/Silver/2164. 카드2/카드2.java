

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> card = new LinkedList<>();

        for(int i = 1 ; i<= N ; i++){
            card.add(i);
        }

        int n = 0;
        while (card.size() > 1){
            n++;
            int tmp = card.poll();
            if (n % 2 == 0){
                card.add(tmp);
            }
        }

        System.out.println(card.poll());
    }
}
