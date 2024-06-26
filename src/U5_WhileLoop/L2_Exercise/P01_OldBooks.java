package U5_WhileLoop.L2_Exercise;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String aniBook = scanner.nextLine();
        String book = scanner.nextLine();

        int checkedBooks = 0;

        while (!book.equals("No More Books")) {
            if (book.equals(aniBook)) {
                System.out.printf("You checked %d books and found it.", checkedBooks);
                return;
            }

            checkedBooks++;
            book = scanner.nextLine();
        }

        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", checkedBooks);
    }
}
