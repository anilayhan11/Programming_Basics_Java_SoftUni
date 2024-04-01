package U4_ForLoop.L1_Lab;

import java.util.Scanner;

public class P03_Numbers1ToNOver3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number += 3) { //със стъпка
            System.out.println(number);

        }
    }
}
