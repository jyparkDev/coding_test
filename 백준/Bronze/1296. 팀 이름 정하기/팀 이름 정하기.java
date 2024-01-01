

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int percent = 0;
        String name  = sc.nextLine();
        int[] nameCountArr = new int[4];
        calculateWordAmount(nameCountArr, name);

        int N = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < N; i++) {

            String teamName = sc.nextLine();
            int[] teamArr = new int[4];

            calculateWordAmount(teamArr, teamName);

            for(int j = 0 ; j < 4 ; j++){
                teamArr[j] += nameCountArr[j];
            }

            int temp = calculatePercent(teamArr);

            if(temp > percent || result.equals("")){
                result = teamName;
                percent = temp;
            }else if(temp == percent){
                if(teamName.compareTo(result) < 0){
                    result = teamName;
                }
            }
        }
        System.out.println(result);
    }

    private static int calculatePercent(int[] arr){

        int sum = 1;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                sum *= (arr[i] + arr[j]);
            }
        }
        return sum % 100;
    }
    private static void calculateWordAmount(int[] arr, String name){
        arr[0] = name.replaceAll("[^L]","").length();
        arr[1] = name.replaceAll("[^O]","").length();
        arr[2] = name.replaceAll("[^V]","").length();
        arr[3] = name.replaceAll("[^E]","").length();
    }
}
