package U3_ConditionalStatementsAdvanced.L1_Lab;

import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= -100 && number <= 100 && number !=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
