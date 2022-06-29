class SavingsAccount extends BankAccount{

	double interestRate;

	public SavingsAccount(double interestRate){
		//super() will be called by the compiler
	this.interestRate = interestRate;
	
	}
	//caclculate periodicInterest 
	public double periodicInterest(){
		double interest = getBalance() * interestRate/100 ;
		deposit(interest);
	return interest ;
	}
	
	
	
}