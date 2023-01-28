import java.util.Scanner;

class Main {
    static boolean cal(int num1, int num2 , int result , String op){
        switch (op) {
            case "+":
                return num1 + num2 == result;
            case "-":
                return num1 - num2 == result;
            case "*":
                return num1 * num2 == result;
            case "/":
                return num1 / num2 == result;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] su = new int[3];
        for(int i = 0 ; i < su.length ;i++){
            su[i] = sc.nextInt();
        }
        String[] opArr = {"+","-","*","/","="};
        String result = "";
        boolean flag = false;
        for (String op : opArr) {
            if(!op.equals("=")) {
                if(cal(su[0],su[1],su[2],op)){
                    System.out.println(su[0]+op+su[1]+"="+su[2]);
                    return;
                }
            }else{
                for(int i = 0 ; i < opArr.length-1 ; i++){
                    String op2 = opArr[i];
                    if(cal(su[1],su[2],su[0],op2)){
                        System.out.println(su[0]+op+su[1]+op2+su[2]);
                        return;
                    }
                }
            }
        }
    }
}
