public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isSmoker;

    public PolicyHolder(String firstName, String lastName, int age, boolean isSmoker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isSmoker = isSmoker;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Smoker: " + (isSmoker ? "Yes" : "No");
    }
}
