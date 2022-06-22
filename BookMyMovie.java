class BookMyMovie{

      String movies[] = {"Om","Yajamana","Mandya","Gaalipata","Mungaru Male","Hatavadi","Cheluvina Chithara","Kirik Party"};
      int noOfTickets ;
	  static int ticketPrice = 600 ;
	  int totalNoOfTickets  ;
	  int totalTicketPrice ;
	  String theatreName ;
	  String snacks[] = {"Coca-Cola","Tedhe Medhe","PopCorn","Gobi"};
	  
     static int totalSnacksPrice = 100;
     String snackName;
     int quantity;
     int seatNo;
     int totalNoOfSnacks;
     int totalSnacks;
	  
	  public BookMyMovie(String theatreName , int totalNoOfTickets){
		  this. theatreName=theatreName;
		  this.totalNoOfTickets=totalNoOfTickets;
		  this.movies = movies;
		  
		  	this.snackName = snackName;
	        this.quantity = quantity;
	        this.seatNo = seatNo;
		  
		  System.out.println("BookMyMovie Object is Created");
	  }
	  
	  public int showTime(int noOfTickets, String bookedBY, String movieName){
		  int totalTicketPrice =0;
	     System.out.println("Inside showTime()......");
		 System.out.println("Arg 1: No Of Tickets " + noOfTickets);
		 System.out.println("Arg 2:Booked By " + bookedBY);
		 System.out.println("Arg 3:Movie Name " + movieName);
	  
	  for (int index = 0 ; index <movies.length ; index++){
	  
	      if (movieName==movies[index]){
		     System.out.println("Movie Name Matched");
			 
		  if(noOfTickets < totalNoOfTickets){
		    
		     totalTicketPrice = noOfTickets*ticketPrice;
			 noOfTickets = totalNoOfTickets-noOfTickets;
			 System.out.println("For Movie : "+ movieName  +" Total Number Of Ticket That are Remaining "+ noOfTickets + " Total price for Tickets "+ totalTicketPrice);
		  
		  }
	    else {
	  System.out.println("Asht Ticket Illa......");
	  }
	   
	  }
	 else{
	  System.out.println("Movie Not Available..... ");
	  }
	
	  }
      return totalTicketPrice;
}
      public int buySnacks(String snackName, int quantity, int bookedSeatNo){
	   int totalSnacksPrice=0;
	   System.out.println("ARG1: Name of snack "+snackName);
	   System.out.println("ARG2: quantity of snack "+quantity);
	    System.out.println("ARG3: booked by seat no "+bookedSeatNo);
		
		for(int i=0; i<snacks.length;i++){
			if(snackName== snacks[i])
			{
				System.out.println("Snack Name is Matched");
				
				if(quantity<totalNoOfSnacks){
                         totalSnacksPrice = quantity * totalSnacksPrice;
                          totalNoOfSnacks = totalNoOfSnacks - quantity;
						  System.out.println("for Snacks: "+ quantity+"Snacks remaining "+ totalNoOfSnacks+" total price is "+totalTicketPrice);
				}
				else {
					System.out.println("Snacks kaali aagide");
				}
			}
			else{
				System.out.println("Snacks not available");
			}
   }
   return totalSnacksPrice;
}
}