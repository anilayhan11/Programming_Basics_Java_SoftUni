package U1_First_Steps_In_Coding.MoreExercise;

import java.util.Scanner;

public class P06_FishMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double priceSkumriya = Double.parseDouble(scanner.nextLine());
        double priceTsatsa = Double.parseDouble(scanner.nextLine());

        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumriya * 1.60;
        double priceSafrid = priceTsatsa * 1.80;
        double priceMidi = 7.50;

        double totalPrice = (kgPalamud * pricePalamud) + (kgSafrid * priceSafrid) + (kgMidi * priceMidi);

        System.out.printf("%.2f", totalPrice);


    }
}
