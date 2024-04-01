package U1_First_Steps_In_Coding.L1_Lab;

import java.util.Scanner;

public class P08_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2.50 lv each
        int dogFoodNumber = Integer.parseInt(scanner.nextLine());
        // 4.00 lv each
        int catFoodNumber = Integer.parseInt(scanner.nextLine());

        double finalSum = (dogFoodNumber * 2.50) + (catFoodNumber * 4.00);

        System.out.println(finalSum + " lv.");
    }
}
