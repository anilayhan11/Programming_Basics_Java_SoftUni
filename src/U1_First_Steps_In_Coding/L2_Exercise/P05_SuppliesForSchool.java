package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P05_SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int cleaning = Integer.parseInt(scan.nextLine());
        int percentDiscount = Integer.parseInt(scan.nextLine());

        double totalPrice = (pens * 5.80) + (markers * 7.20) + (cleaning * 1.20);
        double finalDiscount = totalPrice * (percentDiscount / 100.0);
        double finalPrice = totalPrice - finalDiscount;

        System.out.println(finalPrice);
    }
}
