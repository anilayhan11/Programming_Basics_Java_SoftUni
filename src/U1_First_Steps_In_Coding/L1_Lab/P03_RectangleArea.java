package U1_First_Steps_In_Coding.L1_Lab;

import java.util.Scanner;

public class P03_RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(a * b);
    }
}
