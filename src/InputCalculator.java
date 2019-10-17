import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long avg = 0;

        while (true) {
            counter++;

            if (!scanner.hasNextInt()) {
                break;
            } else {
                int number = scanner.nextInt();
                sum += number;
                avg = (Math.round ((double) sum / (double) counter));
            }

            scanner.nextLine();

        }

        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }

}
