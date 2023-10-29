public class Policy {
    private static int numberOfPolicies = 0;

    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private double height;
    private double weight;

    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        this.height = height;
        this.weight = weight;
        numberOfPolicies++;
    }

    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double calculateBMI() {
        final double CONVERSION_FACTOR = 703;
        return (weight * CONVERSION_FACTOR) / (height * height);
    }

    public double calculatePolicyPrice() {
        final double BASE_PRICE = 600;
        final double ADDITIONAL_FEE_AGE = 75;
        final double ADDITIONAL_FEE_SMOKER = 100;
        final double ADDITIONAL_FEE_PER_BMI = 20;
        final int AGE_THRESHOLD = 50;
        final double BMI_THRESHOLD = 35;

        double price = BASE_PRICE;

        if (policyHolder.isSmoker()) {
            price += ADDITIONAL_FEE_SMOKER;
        }

        if (policyHolder.getAge() > AGE_THRESHOLD) {
            price += ADDITIONAL_FEE_AGE;
        }

        if (calculateBMI() > BMI_THRESHOLD) {
            price += ((calculateBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
        }

        return price;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString() + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               String.format("Policyholder's BMI: %.2f\n", calculateBMI()) +
               String.format("Policy Price: $%.2f\n", calculatePolicyPrice());
    }
}
