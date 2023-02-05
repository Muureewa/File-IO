import java.util.Scanner;
import java.text.DecimalFormat;

public class CoinCounter {
    public static void countCoins(Scanner input) {
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;

        while (input.hasNext()) {
            int num = input.nextInt();
            String coinType = input.next().toLowerCase();

            switch (coinType) {
                case "pennies":
                    pennies += num;
                    break;
                case "nickels":
                    nickels += num;
                    break;
                case "dimes":
                    dimes += num;
                    break;
                case "quarters":
                    quarters += num;
                    break;
            }
        }

        double total = pennies * 0.01 + nickels * 0.05 + dimes * 0.1 + quarters * 0.25;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Total money: $" + df.format(total));
    }
}
