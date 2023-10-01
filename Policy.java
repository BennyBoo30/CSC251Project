
public class Policy{

   private String policyNumber;
   private int holderAge;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private String smokeStatus;
   private double holderHeight;
   private double holderWeight;
   
   public Policy(String policyNumber,String providerName,String holderFirstName,String holderLastName,int holderAge,
                  String smokeStatus, double holderHeight, double holderWeight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.smokeStatus = smokeStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;      
   
   }
   
   // @return policyNumber, the policy nubmber of the insurance
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   //@parm PolicyNumber
   // setting the number of the policy 
   public void setPolicyNumber(String policyNumber)
   {
       this.policyNumber = policyNumber;
   }
   
   //@return the age of the insurance holder.
   public int getHolderAge()
   {
      return holderAge;
   }
   
   //@parm holderAge 
   //setting the age of the insurance holder.
   public void setHolderAge(int holderAge)
   {
      this.holderAge = holderAge ;
   }
   
   //@return providerName 
   // getting the name of the insurance provider
   public String getProviderName()
   {
      return providerName;
   }
   
   //@parm providerName
   // setting the name of the insurance provider
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   //@return holderFirstName
   // return the first name.
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   //@parm holderFirstName 
   //setting the insured person's first name.
   public void setHolderFirstName(String holderFirstName)
   {
      this.holderFirstName = holderFirstName;
   }
   
   //@return getHolderLastName
   // returning last name.
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   //@parm holderLastName
   // setting the insured holder's last name.
   public void setHolderLastName(String holderLastName)
   {
      this.holderLastName = holderLastName;
   }
   
   //@return smokeStatus
   // returining the smoke status of the insured person
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   //@parm smokeStatus
   // set the status for the smoking question
   public void setSmokeStatus(String smokeStatus)
   {
      this.smokeStatus = smokeStatus;
   }
   
   //@return getHolderHeight
   //returning the hight
   public double getHolderHeight()
   {
      return holderHeight;
   }
   
   //@parm setHolderHeight
   //setting the insured person's hight 
   public void setHolderHeight(double holderHeight)
   {
       this.holderHeight = holderHeight;
   }
   
   //@return getHolderWeight
   // returning the insured person's weight.
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   //@parm setHolderWeight
   // setting the insured person's weight.
   public void setHolderWeight(double holderWeight)
   {
       this.holderWeight = holderWeight;
   }
   
   
   public double getBmi()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
   public double getPolicyPrice()
   {
      double baseFee = 600;
      double addOnAge = 0;
      double addOnSmoke = 0;
      double addOnBmi = 0;
      
       if(holderAge > 50)
       {
          addOnAge = 75;
       }
       else{
         addOnAge = 0;
       }
         
       if (smokeStatus.equalsIgnoreCase("smoker"))
       {
         addOnSmoke = 100;
       }
       else{
         addOnSmoke = 0;
       }
       
       double bmi = getBmi();
       if (bmi > 35)
       {
         addOnBmi = (bmi - 35) * 20;
       }
       
       return baseFee + addOnAge + addOnSmoke + addOnBmi;
   }
   
}