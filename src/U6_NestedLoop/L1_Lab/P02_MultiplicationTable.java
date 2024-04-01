package U6_NestedLoop.L1_Lab;

public class P02_MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int k = 1; k <= 10; k++) {
                System.out.printf("%d * %d = %d%n", i, k, i * k);
            }
        }
    }
}

