package U6_NestedLoop.MoreExercise;

import java.util.Scanner;

public class P10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notes1Count = Integer.parseInt(scanner.nextLine());
        int notes2Count = Integer.parseInt(scanner.nextLine());
        int notes5Count = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= notes1Count; i++) {
            for (int j = 0; j <= notes2Count; j++) {
                for (int k = 0; k <= notes5Count; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                }

            }
        }
    }
}
