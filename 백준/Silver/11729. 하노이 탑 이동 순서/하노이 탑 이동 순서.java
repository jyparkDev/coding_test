import java.util.*;

class Main{
    static StringBuilder sb = new StringBuilder();
    static int result = 0;

    static void move(int no , int x , int y){
        int[] xstak = new int[100];
        int[] ystak = new int[100];
        int[] sstak = new int[100];
        int ptr = 0;
        int sw = 0;

        while(true){
            if(sw == 0 && no > 1){
                xstak[ptr] = x;
                ystak[ptr] = y;
                sstak[ptr] = sw;
                ptr++;
                no = no - 1;
                y = 6 - x - y;
                continue;
            }
            sb.append(x + " " + y+"\n");
            result++;
            if(sw == 1 && no > 1){
                xstak[ptr] = x;
                ystak[ptr] = y;
                sstak[ptr] = sw;
                ptr++;
                x = 6 - x - y;
                no = no - 1;
                if(sw == 1) sw = 0;
                continue;
            }
            do{
                if(ptr-- == 0)
                    return;
                x = xstak[ptr];
                y = ystak[ptr];
                sw = sstak[ptr] + 1;
                no = no + 1;
            }while(sw == 2);

        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        move(n,1,3);
        System.out.println(result);
        System.out.println(sb.toString());
    }
}