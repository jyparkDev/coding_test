

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lamda = sc.nextInt();

        if (lamda >= 620){
            System.out.println("Red");
        }else if (lamda >= 590){
            System.out.println("Orange");
        }else if (lamda >= 570){
            System.out.println("Yellow");
        }else if (lamda >= 495){
            System.out.println("Green");
        }else if(lamda >= 450){
            System.out.println("Blue");
        }else if (lamda >= 425){
            System.out.println("Indigo");
        }else {
            System.out.println("Violet");
        }
    }
}
