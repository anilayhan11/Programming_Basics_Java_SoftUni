package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P01_USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 USD = 1.79549 BGN
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);

    }
}

// ctrl + alt + L -> reformat code