package U6_NestedLoop.L2_Exercise;

import java.util.Scanner;

public class P01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count  = 1;

        for (int row = 0; row <= n; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(count + " ");
                if (count == n) {
                    return;
                }

                count++;

            }

            System.out.println();
        }
    }
}
