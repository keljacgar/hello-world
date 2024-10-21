public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height; 
    private double weight; 
    /**
     * Constructs a Policy object with default values.
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0.0;
        this.weight = 0.0;
    }
    /**
     * Constructs a Policy object with the specified values.
     *
     * @param policyNumber The policy number.
     * @param providerName The name of the insurance provider.
     * @param firstName The policyholder's first name.
     * @param lastName The policyholder's last name.
     * @param age The policyholder's age.
     * @param smokingStatus The smoking status (either "smoker" or "non-smoker").
     * @param height The policyholder's height in inches.
     * @param weight The policyholder's weight in pounds.
     */
    public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    /** 
     * Gets the policy number. 
     * 
     * @return The policy number. 
     */
    public int getPolicyNumber() {
        return policyNumber;
    }
    /** 
     * Sets the policy number. 
     * 
     * @param policyNumber The new policy number. 
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    /** 
     * Gets the provider name. 
     * 
     * @return The provider name. 
     */
    public String getProviderName() {
        return providerName;
    }
    /** 
     * Sets the provider name. 
     * 
     * @param providerName The new provider name. 
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    /** 
     * Gets the policyholder's first name. 
     * 
     * @return The policyholder's first name. 
     */
    public String getFirstName() {
        return firstName;
    }
    /** 
     * Sets the policyholder's first name. 
     * 
     * @param firstName The new first name. 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /** 
     * Gets the policyholder's last name. 
     * 
     * @return The policyholder's last name. 
     */
    public String getLastName() {
        return lastName;
    }
    /** 
     * Sets the policyholder's last name. 
     * 
     * @param lastName The new last name. 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /** 
     * Gets the policyholder's age. 
     * 
     * @return The policyholder's age. 
     */
    public int getAge() {
        return age;
    }
    /** 
     * Sets the policyholder's age. 
     * 
     * @param age The new age. 
     */
    public void setAge(int age) {
        this.age = age;
    }
    /** 
     * Gets the policyholder's smoking status. 
     * 
     * @return The smoking status ("smoker" or "non-smoker"). 
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }
    /** 
     * Sets the policyholder's smoking status. 
     * 
     * @param smokingStatus The new smoking status. 
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }
    /** 
     * Gets the policyholder's height in inches. 
     * 
     * @return The height in inches. 
     */
    public double getHeight() {
        return height;
    }
    /** 
     * Sets the policyholder's height. 
     * 
     * @param height The new height in inches. 
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /** 
     * Gets the policyholder's weight in pounds. 
     * 
     * @return The weight in pounds. 
     */
    public double getWeight() {
        return weight;
    }
    /** 
     * Sets the policyholder's weight. 
     * 
     * @param weight The new weight in pounds. 
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Calculates the Body Mass Index (BMI) of the policyholder.
     *
     * @return The calculated BMI value.
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    /**
     * Calculates the policy price based on the policyholder's age, 
     * smoking status, and BMI.
     *
     * @return The calculated policy price.
     */
    public double calculatePolicyPrice() {
        double basePrice = 600;
        if (age > 50) {
            basePrice += 75;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            basePrice += 100;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            basePrice += (bmi - 35) * 20;
        }

        return basePrice;
    }
}
