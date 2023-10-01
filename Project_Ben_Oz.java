import java.io.*;
import java.util.Scanner;

public class Project2_Ben_Oz{

   public static void main(String[] args) throws IOException{
   
   // open and process text file containing info about Insurance Policy
   
   File file = new File("PolicyInformation.txt");
   
   if(!file.exists())
   {
      System.out.println("Unable to find file!");
      System.exit(0);
   }
   
   Scanner inputFile = new Scanner(file); 
   
   String policyNumber;
   int holderAge;
   String providerName;
   String holderFirstName;
   String holderLastName;
   String smokeStatus;
   double holderHeight;
   double holderWeight;
   double totalSmokers = 0;
   
   // use loop to process all the contents of the file 
   while(inputFile.hasNext())
   {
      policyNumber = inputFile.nextLine();
      providerName = inputFile.nextLine();
      holderFirstName = inputFile.nextLine();
      holderLastName = inputFile.nextLine();
      holderAge = inputFile.nextInt();
      smokeStatus = inputFile.nextLine();
      totalSmokers += smokeStatus;
      holderHeight = inputFile.nextDouble();
      holderWeight = inputFile.nextDouble();
      
      if(inputFile.hasNext())
         inputFile.nextLine(); // clear the newline
      if(inputFile.hasNext())
      inputFile.nextLine(); // skip the blank space lines in the file
      
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + holderFirstName);
      System.out.println("Policyholder's Last Name: " + holderLastName);
      System.out.println("Policyholder's Age: " + holderAge);
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + smokeStatus);
      System.out.println("Policyholder's Height: " + holderHeight);
      System.out.println("Policyholder's Weight: " + holderWeight);
      System.out.println("Policyholder’s BMI: " + String.format("%.2f", myPolicy.calcBmi()));
      System.out.println("Policy Price: $" + String.format("%.2f", myPolicy.calcPolicyPrice()));

      
   }
   inputFile.close(); 
   
        System.out.println("The number of policies with a smoker is: " + totalSmokers);
        System.out.println("The number of policies with a non-smoker is: "+ totalSmokers);
   
   
   Policy myPolicy = new Policy(policyNumber, providerName, holderFirstName, holderLastName,holderAge,
                             smokeStatus,holderHeight ,holderWeight);
   
   }
}  