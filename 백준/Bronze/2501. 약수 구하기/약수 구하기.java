import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int p = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= q ; i++){
            if(q % i == 0) list.add(i);
        }
        try{
            System.out.println(list.get(p-1));
        }catch (Exception e){
            System.out.println(0);
        }
    }
}
