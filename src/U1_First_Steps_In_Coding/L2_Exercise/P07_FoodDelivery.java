package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P07_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());
        double allMenus = chickenMenus * 10.35 + fishMenus * 12.40 + vegetarianMenus * 8.15;
        double dessert = allMenus * 0.20;

        // delivery fee - 2.50
        double finalPrice = allMenus + dessert + 2.50;

        System.out.println(finalPrice);
    }
}
