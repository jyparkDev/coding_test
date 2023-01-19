import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> numArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        for(int i = 0 ; i < 7 ; i++){
            if( (a = sc.nextInt()) % 2 == 1){
                sum += a;
                numArr.add(a);
            }
        }
        if(numArr.size() == 0){
            System.out.println(-1);
            return;
        } 
        Collections.sort(numArr);
        System.out.println(sum);
        System.out.println(numArr.get(0));
    }
}