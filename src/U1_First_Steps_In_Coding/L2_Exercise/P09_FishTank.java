package U1_First_Steps_In_Coding.L2_Exercise;

import java.util.Scanner;

public class P09_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentFullAlready = Double.parseDouble(scanner.nextLine());

        double volumeInCm = length * width * height;
        double volumeInLiters = volumeInCm / 1000.0;
        double takenSpace = volumeInLiters * (percentFullAlready / 100.0);

        System.out.println(volumeInLiters - takenSpace);

    }
}
