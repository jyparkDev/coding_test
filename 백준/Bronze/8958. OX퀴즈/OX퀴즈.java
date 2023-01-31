import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            char[] ch = sc.next().toCharArray();
            int num = 0;
            for(int j = 0,count=0 ; j < ch.length ; j++){
                if(ch[j] == 'X'){
                    count = 0;
                }else{
                    num += ++count;
                }
            }
            System.out.println(num);
            
        }
    }
}