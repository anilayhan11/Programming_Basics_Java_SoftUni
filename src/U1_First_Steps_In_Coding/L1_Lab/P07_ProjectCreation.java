package U1_First_Steps_In_Coding.L1_Lab;

import java.util.Scanner;

public class P07_ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architectName = scanner.nextLine();
        int projectsNumber = Integer.parseInt(scanner.nextLine());
        int projectHours = projectsNumber * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, projectHours, projectsNumber);
    }
}
