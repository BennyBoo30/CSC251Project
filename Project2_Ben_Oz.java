import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project2_Ben_Oz{

   public static void main(String[] args){
   
   // open and process text file containing info about Insurance Policy
   
   try {
   File policyFile = new File("PolicyInformation.txt");
   Scanner inputFile = new Scanner(policyFile); 
   
   String policyNumber;
   String providerName;
   String holderFirstName;
   String holderLastName;
   int holderAge;
   String smokeStatus;
   double holderHeight;
   double holderWeight;
   
   //Create an array list to store objects. The ArrayList will hold Policy Objects
   ArrayList<Policy> policies = new ArrayList<Policy>();
   Policy c;
   
   /*  Use a while loop to read the file. Use the hasNext() method to determine whether 
       the file has more data to be read. Use an "if statement" to determine the end of the file and 
       to consume newline characters */

   while(inputFile.hasNext())
   {
      policyNumber = inputFile.nextLine();
      providerName = inputFile.nextLine();
      holderFirstName = inputFile.nextLine();
      holderLastName = inputFile.nextLine();
      holderAge = Integer.parseInt(inputFile.nextLine());
      smokeStatus = inputFile.nextLine();
      holderHeight = Double.parseDouble(inputFile.nextLine());
      holderWeight = Double.parseDouble(inputFile.nextLine());
      
       if(inputFile.hasNext())
      {
         inputFile.nextLine(); // clear the newline
         inputFile.nextLine(); // skip the blank space lines in the file
      }
      
    /* Create Policy objects using the Policy class type - we are still under the while loop. Objects will be created as long as there are records
       in the file to read.*/

      c = new Policy(policyNumber, providerName, holderFirstName, holderLastName,
                    holderAge, smokeStatus, holderHeight, holderWeight);
      policies.add(c);
  
   } // close the loop
      inputFile.close(); 
      
       int totalSmokers = 0;
       int totalNonSmokers = 0;
      
      for(int i =0;i < policies.size(); i++)
      {          
      System.out.println("Policy Number: " + policies.get(i).getPolicyNumber());
      System.out.println("Provider Name: " + policies.get(i).getProviderName());
      System.out.println("Policyholder's First Name: " + policies.get(i).getHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policies.get(i).getHolderLastName());
      System.out.println("Policyholder's Age: " + policies.get(i).getHolderAge());
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policies.get(i).getSmokeStatus());
      System.out.println("Policyholder's Height: " + policies.get(i).getHolderHeight());
      System.out.println("Policyholder's Weight: " + policies.get(i).getHolderWeight());
      System.out.printf("Policyholder's BMI %.2f\n: " , policies.get(i).getBmi());
      System.out.printf("Policyholder's price %.2f\n: ", policies.get(i).getPolicyPrice());
 
      
      
      System.out.println();
      
        if (policies.get(i).getSmokeStatus().equalsIgnoreCase("smoker")) {
                totalSmokers++;
            } else {
                totalNonSmokers++;
            }
        }

        System.out.println("The number of policies with a smoker is: " + totalSmokers);
        System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      }//close the "try" block of code
      
      //If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with
      catch(IOException ex)
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
           
      }
      
   }//close main
} //close the class container  