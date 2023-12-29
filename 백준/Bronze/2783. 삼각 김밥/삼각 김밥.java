import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int orderCount = 1000;
        ArrayList<Double> weightPerPrice = new ArrayList();
        weightPerPrice.add(getPrice());

        int N = sc.nextInt();

        for (int i = 1 ; i <= N ; i++){
            weightPerPrice.add(getPrice());
        }

        double[] priceArr = weightPerPrice.stream().sorted().mapToDouble(x -> x).toArray();
        System.out.printf("%.2f",orderCount * priceArr[0]);

    }

    private static double getPrice(){
        double price = sc.nextDouble();
        double weight = sc.nextDouble();
        return price / weight;
    }
}