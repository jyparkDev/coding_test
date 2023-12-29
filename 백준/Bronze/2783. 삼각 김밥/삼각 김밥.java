import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int orderCount = 1000;
        double weightPerPrice = getPrice();

        int N = sc.nextInt();

        for (int i = 1 ; i <= N ; i++){
            double target = getPrice();
            if (target < weightPerPrice){
                weightPerPrice = target;
            }
        }

        System.out.printf("%.2f",orderCount * weightPerPrice);

    }

    private static double getPrice(){
        double price = sc.nextDouble();
        double weight = sc.nextDouble();
        return price / weight;
    }
}
