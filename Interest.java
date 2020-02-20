package com.epam.cleancode;

public class Interest {
	public double SimpleInterest(int principal_amount,double rate_of_interest,int time)
	   {
		   return principal_amount*rate_of_interest*time;
	   }
	   public double CompoundInterest(int principal_amount,double rate_of_interest,int time,int no_of_times)
	   {
		   return (principal_amount*Math.pow(1+(rate_of_interest/no_of_times),no_of_times*time))-principal_amount;
	   }
}
