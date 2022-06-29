class AccountTester{

public static void main(String a []){
	
	SavingsAccount sa = new SavingsAccount(0.4);
	sa.deposit(5000.00);
	sa.withDraw(500.00);
	double amount = sa.getBalance();
	System.out.println("Balance of existing Account"+amount);
	
	
	
	SavingsAccount other = new SavingsAccount(0.4);
	sa.transfer(3000.00, other);
	double totalAmount = other.getBalance();
	System.out.println("Balance of other Account"+totalAmount);
	
	 CurrentAccount ca = new CurrentAccount(14, 1.6);
	  ca.deposit(12000.00);
	  ca.withdraw(2100.00);
	  ca.deposit(3400.00);
	  ca.withdraw(1800.00);

	  ca.deductionOfFee();
	  ca.periodicInterest();
	  ca.getBalance();
}
}