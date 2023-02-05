import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class blueGreen {

    public static void blueGreen(Scanner input) {
        int purple = 0;
        int purpleSum = 0;
        int gold = 0;
        int goldSum = 0;
        int i = 2;

        while (input.hasNext()) {
            input.next();
            if ((i / 2) % 2 != 0) {
                purpleSum += input.nextInt();
                purple++;
            } else {
                goldSum += input.nextInt();
                gold++;
            }
            i += 2;
        }

        System.out.println(purple + " purple, " + gold + " gold");
        System.out.println("Difference between purple team  and gold team sums: " + Math.abs(purpleSum - goldSum));
    }

    public  static  void main(String[] args){
        try {
            Scanner input = new Scanner(new File("tas.txt"));
            blueGreen(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}