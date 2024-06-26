package U2_ConditionalStatements.L2_Exercise;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double timeForEating = lunchBreak / 8.00;
        double timeForRest = lunchBreak / 4.00;

        double freeTime = lunchBreak - timeForEating - timeForRest;

        if (freeTime >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.ceil(freeTime - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.ceil(episodeDuration - freeTime));
        }
    }
}
