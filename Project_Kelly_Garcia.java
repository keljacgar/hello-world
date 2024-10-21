import java.util.ArrayList;
import java.util.Scanner;

public class Project_Kelly_Garcia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cookie> cookieBatches = new ArrayList<>();

        // Ask for the number of batches and validate input
        int numberOfBatches;
        do {
            System.out.print("Enter the number of batches of chocolate chip cookies (min: 1 - max: 15): ");
            numberOfBatches = scanner.nextInt();
            if (numberOfBatches < 1 || numberOfBatches > 15) {
                System.out.println("ERROR: INVALID NUMBER OF BATCHES ENTERED. TRY AGAIN. /nEnter the number of batches of cookies (min: 1 - max: 15):");
            }
        } while (numberOfBatches < 1 || numberOfBatches > 15);

        // Loop through each batch
        for (int i = 1; i <= numberOfBatches; i++) {
            int numberOfCookies;
            do {
                System.out.printf("Enter the number of cookies for batch %d (min: 12 - max: 300): ", i);
                numberOfCookies = scanner.nextInt();
                if (numberOfCookies < 12 || numberOfCookies > 300) {
                    System.out.println("ERROR: INVALID NUMBER OF COOKIES. TRY AGAIN. /nEnter the number of cookies for batch %d (min: 12 - max: 300).");
                }
            } while (numberOfCookies < 12 || numberOfCookies > 300);

            // Create a Cookie object and add it to the list
            Cookie batch = new Cookie(numberOfCookies);
            cookieBatches.add(batch);
        }

        // Display the report
        System.out.println("\n--- Chocolate Chip Cookie Batches ---");

        int batchNumber = 1;
        for (Cookie batch : cookieBatches) {
            System.out.printf("\n-- Batch #%d --\n", batchNumber++);
            System.out.println("Ingredients needed for batch:");
            System.out.printf("Number of cookies: %d\n", batch.getNumberOfCookies());
            System.out.printf("Cups of Sugar: %.2f\n", batch.getCupsOfSugar());
            System.out.printf("Cups of Butter: %.2f\n", batch.getCupsOfButter());
            System.out.printf("Cups of Flour: %.2f\n", batch.getCupsOfFlour());
            System.out.printf("Cups of Chocolate Chips: %.2f\n", batch.getCupsOfChocolateChips());
        }

        // Display totals
        int totalCookies = 0;
        double totalSugar = 0;
        double totalButter = 0;
        double totalFlour = 0;
        double totalChips = 0;

        for (Cookie batch : cookieBatches) {
            totalCookies += batch.getNumberOfCookies();
            totalSugar += batch.getCupsOfSugar();
            totalButter += batch.getCupsOfButter();
            totalFlour += batch.getCupsOfFlour();
            totalChips += batch.getCupsOfChocolateChips();
        }

        System.out.println("\nTotal batches: " + numberOfBatches);
        System.out.println("Total cookies: " + totalCookies);
        System.out.printf("Total cups of Sugar: %.2f\n", totalSugar);
        System.out.printf("Total cups of Butter: %.2f\n", totalButter);
        System.out.printf("Total cups of Flour: %.2f\n", totalFlour);
        System.out.printf("Total cups of Chocolate Chips: %.2f\n", totalChips);

        scanner.close();
    }
}
