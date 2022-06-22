class Employee{


	 //instance variables
	  String employeeName ; 
	  String bloodGroup ;
	  String employeeLocation;
	  
	// Parameterized Constructor
	public Employee(String eName, String bGroup, String eLocation){
		System.out.println("Employee ID Created");
		employeeName = eName;
		bloodGroup = bGroup;
		employeeLocation = eLocation;
		
	}
	//main method-----starting point
    public static void main(String a[]){
		
	//constructor are used to initialize the instance variable of a class
	 Employee   empl  = new Employee("Gowda C K", "B+", "Tumkur");
	 System.out.println(empl.employeeName+"    "+empl.bloodGroup+"   "+empl.employeeLocation);
	 Employee    empl1  = new Employee("Yogesh T S", "O+", "Mysore");
     System.out.println(empl1.employeeName+"    "+empl1.bloodGroup+"   "+empl1.employeeLocation);	 
	 Employee    empl2  = new Employee("Spoorthy V S", "AB+", "Davanagere");	
	 System.out.println(empl2.employeeName+"    "+empl2.bloodGroup+"   "+empl2.employeeLocation);
	}
		

	}

   


