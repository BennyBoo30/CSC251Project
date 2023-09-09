
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
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setPolicyNumber(String policyNumber)
   {
       this.policyNumber = policyNumber;
   }
   
   public int getHolderAge()
   {
      return holderAge;
   }
   
   public void setHolderAge(int holderAge)
   {
      this.holderAge = holderAge ;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   public void setHolderFirstName(String holderFirstName)
   {
      this.holderFirstName = holderFirstName;
   }
   
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   public void setHolderLastName(String holderLastName)
   {
      this.holderLastName = holderLastName;
   }
   
   public String getSmokeStatus()
   {
      return smokeStatus;
   }
   
   public void setSmokeStatus(String smokeStatus)
   {
      this.smokeStatus = smokeStatus;
   }
   
   public double getHolderHeight()
   {
      return holderHeight;
   }
   
   public void setHolderHeight(double holderHeight)
   {
       this.holderHeight = holderHeight;
   }
   
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   public void setHolderWeight(double holderWeight)
   {
       this.holderWeight = holderWeight;
   }
   
   public double calcBmi()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
   public double calcPolicyPrice()
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
       
       double bmi = calcBmi();
       if (bmi > 35)
       {
         addOnBmi = (bmi - 35) * 20;
       }
       
       return baseFee + addOnAge + addOnSmoke + addOnBmi;
   }
   
}