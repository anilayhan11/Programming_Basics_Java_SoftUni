package U4_ForLoop.MoreExercise;

public class P10_Clock2 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {
            for (int min = 0; min <= 59; min++) {
                for (int sec = 0; sec <= 59; sec++) {

                    System.out.printf("%d : %d : %d\n", hour, min, sec);
                }

            }

        }
    }
}

