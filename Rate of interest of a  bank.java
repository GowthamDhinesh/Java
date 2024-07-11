Rate of interest of a abnk

import java.util.Scanner;
 interface PNB
{
	 void rateofinterest();
}
 interface SBI
 {
	 void Rateofinterest();
 }
 class Bank implements PNB,SBI
 {
	 public void rateofinterest()
	 {
		 System.out.println("PNB rateofinterest is 9.3%");
	 }
	public  void Rateofinterest()
	 {
		 System.out.println("SBI Rateofinterest is 9.5%");
	 }
 
	public static void main(String[] args)
	{
		Bank obj=new Bank();
		obj.rateofinterest();
		obj.Rateofinterest();
		
	}
	}
