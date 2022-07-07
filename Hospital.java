class Hospital{

		//Has many patients

	PatientDTO[] dtos= new PatientDTO[5];
	//instance variable
	int index;

	public Hospital(){
			System.out.println ("Hospital Object is Created");
	}
	
	public boolean createPatient(PatientDTO dto){
			System.out.println("Inside create Patient Method");
		boolean isAdded = false ;
		if (dto !=null || dto.getName() !=null){
			this.dtos[index++]=dto ;
			isAdded = true ;
			System.out.println("Patient information Added successfully");
		}
		else{
			System.out.println("Cannot Add Patient... Please fill the mandatory fields");
		}
	return isAdded;
	}
	public void getPatientDetails(){
		System.out.println("Inside get Patient Details");
		for(int i =0 ; i<dtos.length ; i++){
			System.out.println(dtos[i].getId()+"    "+dtos[i].getName()+"    "+dtos[i].getAddress()+"    "+dtos[i].getGender()+"    "+dtos[i].getContactNo());
		}
		
	}
	
}