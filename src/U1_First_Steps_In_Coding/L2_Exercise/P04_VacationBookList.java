package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P04_VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = (numberOfPages / pagesPerHour) / numberOfDays;

        System.out.println(hoursPerDay);

    }
}
