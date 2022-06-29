class BankAccount{

       static double amount ;
	   
	   
	   public static void main(String a[]){
    	System.out.println("main method started");	   
	   deposit(6700.67);
	   //invoke withDraw()
	   withDraw(2000);  
	   deposit(12000.90);
	   
	   }

      static void  deposit(double amt){
	  System.out.println("invoked deposit()");
	  System.out.println("Amount to be deposit "+amt);
	  System.out.println("Amount before deposit "+amt);
	     amount = amount + amt ;
	  System.out.println("Amount after deposit "+amount);
	  System.out.println("end of deposit");
	  
	  }

      static void withDraw(double amt){
	  System.out.println("invoked withDraw()");  
	  System.out.println("Amount to be withDraw "+amt);
	  System.out.println("Amount before withDraw "+amount);
		  amount = amount - amt ;
	  System.out.println("Amount after withDraw "+amount); 
	  System.out.println("end of withDraw");
	  
		  
	  }



}