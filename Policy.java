public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;  
    private static int policyCount = 0; 

    /**
     * Default constructor for Policy.
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.policcyHolder = new PolicyHolder();
        policyCount++;
    }

    /**
     * Parameterized constructor for Policy.
     * @param policyNumber the policy number.
     * @param providerName the name of the provider.
     * @param policyHolder the policy holder.
     */
    public Policy(int policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    public int getpolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    /**
     * Calculates the price of the policy based on various factors.
     * @return The calculated policy price.
     */
    public double calculatePolicyPrice() {
        double basePrice = 600;
        if (policyHolder.getAge() > 50) {
            basePrice += 75;
        }
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            basePrice += 100;
        }

        double bmi = policyHolder.calculateBMI();
        if (bmi > 35) {
            basePrice += (bmi - 35) * 20;
        }

        return basePrice;
    }

    /**
     * Returns a string representation of the Policy.
     * @return A string containing policy details.
     */
    @Override
    public String toString() {
        return "Policy Number:" + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + policyHolder.toString() +
               "\nPolicy Price:$" + String.format("%.2f", calculatePolicyPrice());
    }

    /**
     * Gets the total number of policies created.
     * @return The total policy count.
     */
    public static int getPolicyCount() {
        return policyCount;
    }
}
