import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Kelly_Garcia {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0, nonSmokerCount = 0;

        try (Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"))) {
            while (fileScanner.hasNextLine()) {
                // Reading each policys info
                String policyNumber = fileScanner.nextLine();
                String providerName = fileScanner.nextLine();
                String firstName = fileScanner.nextLine();
                String lastName = fileScanner.nextLine();
                int age = Integer.parseInt(fileScanner.nextLine());
                String smokingStatus = fileScanner.nextLine();
                double height = Double.parseDouble(fileScanner.nextLine());
                double weight = Double.parseDouble(fileScanner.nextLine());

                // Creating and storing the policy object
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                // tracking smoker and non-smoker count
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: PolicyInformation.txt not found.");
            return;
        }

        // Display all policy info
        for (Policy policy : policies) {
            System.out.println(policy);
        }

        // Displays smokers and non-smokers count
        System.out.printf("Thee number of policies with a smoker is: %d\n", smokerCount);
        System.out.printf("The number of policies with a non-smoker is: %d\n", nonSmokerCount);
    }
}
