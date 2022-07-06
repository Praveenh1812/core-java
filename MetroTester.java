class MetroTester{

	public static void main (String a[]){
	Metro	m	=	new Metro();
	m.setStationName ("DasaraHalli Metro Station");
	m.setLocation ("DasaraHalli");
	m.setStationNumber (3);
	m.setMetroFrequencyTime (10.00);
	
		System.out.println(m.getStationName() + "  " + m.getLocation() + "  " + m.getStationNumber() + "  " + m.getMetroFrequencyTime());
	
	m.goodTransportation();
	
	
	}

}
