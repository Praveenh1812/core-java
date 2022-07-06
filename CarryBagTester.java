class CarryBagTester{

	public static void main(String a[]){
	CarryBag	carry	= new	CarryBag();
	/*carry.name = "Baba's Carry Bag";
	carry.name = 5.00;*/
	carry.setName ("Baba's Carry Bag");
	carry.setPrice(5.00);
	carry.holdThings();
	
		System.out.println(carry.getName()+"  "+carry.getPrice());
	
	
	}


}