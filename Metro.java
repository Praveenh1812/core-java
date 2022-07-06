public class Metro{

	private String stationName ;
	private String location;
	private int stationNumber ;
	private double metroFrequencyTime;

	
	public String getStationName(){
		return stationName;
	}
	public void setStationName(String stationName){
		this.stationName = stationName;
	}
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}	
	
	public int getStationNumber(){
		return stationNumber;
	}
	public void setStationNumber(int stationNumber){
		this.stationNumber = stationNumber;
	}	
	public double getMetroFrequencyTime(){
		return metroFrequencyTime;
	}
	public void setMetroFrequencyTime(double metroFrequencyTime){
		this.metroFrequencyTime = metroFrequencyTime;
	}
	void goodTransportation (){
	System.out.println("It helps us to reach the Destination in time");
	}
}