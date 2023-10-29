import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Policy> policies = new ArrayList<>();

        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            String policyNumber = inputFile.nextLine();
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = inputFile.nextInt();
            inputFile.nextLine(); // Consume the newline character after age
            boolean isSmoker = inputFile.nextLine().equalsIgnoreCase("smoker");
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();
            inputFile.nextLine(); // Consume the newline character after weight

            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, isSmoker);
            Policy policy = new Policy(policyNumber, providerName, policyHolder, height, weight);
            policies.add(policy);
        }

        // Output policy information
        for (Policy policy : policies) {
            System.out.println(policy);
            System.out.println();
        }

        // Output additional information
        System.out.println("Number of Policy objects created: " + Policy.getNumberOfPolicies());
        System.out.println("Number of smokers: " + countSmokers(policies));
        System.out.println("Number of non-smokers: " + (policies.size() - countSmokers(policies)));
    }

    private static int countSmokers(ArrayList<Policy> policies) {
        int count = 0;
        for (Policy policy : policies) {
            if (policy.getPolicyHolder().isSmoker()) {
                count++;
            }
        }
        return count;
    }
}
