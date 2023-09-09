import java.util.Scanner;

public class Project_Ben_Oz{

   public static void main(String[] args){
   
   Scanner keyboard = new Scanner(System.in);
   
   String policyNumber;
   int holderAge;
   String providerName;
   String holderFirstName;
   String holderLastName;
   String smokeStatus;
   double holderHeight;
   double holderWeight;
    
   System.out.print("Please enter the Policy Number: ");
   policyNumber = keyboard.nextLine();
   System.out.print("Please enter the Provider Name: ");
   providerName = keyboard.nextLine();
   System.out.print("Please enter the Policyholder’s First Name: ");
   holderFirstName = keyboard.nextLine();
   System.out.print("Please enter the Policyholder’s Last Name: ");
   holderLastName = keyboard.nextLine();
   System.out.print("Please enter the Policyholder’s Age: ");
   holderAge = keyboard.nextInt();
   keyboard.nextLine();
   System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
   smokeStatus = keyboard.nextLine();
   System.out.print("Please enter the Policyholder’s Height (in inches): ");
   holderHeight = keyboard.nextDouble();
   System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
   holderWeight = keyboard.nextDouble();
   keyboard.close();
   
   Policy myPolicy = new Policy(policyNumber, providerName, holderFirstName, holderLastName,holderAge,
                             smokeStatus,holderHeight ,holderWeight);
   
    System.out.println("\nPolicy Number: " + myPolicy.getPolicyNumber());
    System.out.println("Provider Name: " + myPolicy.getProviderName());
    System.out.println("Policyholder’s First Name: " + myPolicy.getHolderFirstName());
    System.out.println("Policyholder’s Last Name: " + myPolicy.getHolderLastName());
    System.out.println("Policyholder’s Age: " + myPolicy.getHolderAge());
    System.out.println("Policyholder’s Smoking Status: " + myPolicy.getSmokeStatus());
    System.out.println("Policyholder’s Height: " + myPolicy.getHolderHeight() + " inches");
    System.out.println("Policyholder’s Weight: " + myPolicy.getHolderWeight() + " pounds");
    System.out.println("Policyholder’s BMI: " + String.format("%.2f", myPolicy.calcBmi()));
    System.out.println("Policy Price: $" + String.format("%.2f", myPolicy.calcPolicyPrice()));
   
   }
}