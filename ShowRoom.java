class ShowRoom{

   public ShowRoom()
   {
	System.out.println("ShowRoom Object Created");
    System.out.println("------------------------")	
	   
   }


   String name;
   long id;
   String address;
   String ownerName;
   long contactNumber;

   public static void main (String a [])
   {
	   
   ShowRoom   showRoom = new ShowRoom();
   showRoom.name="Honda";
   showRoom.id = 23456543l;
   showRoom.address = "BHASHYAM Circle";
   showRoom.ownerName = "Ram";
   showRoom.contactNumber = 7897897890l;
   
   
   System.out.println("The Name of the ShowRoom is "+showRoom.name);
   System.out.println("The ID of the ShowRoom is "+showRoom.id);
   System.out.println("The Address of the ShowRoom is "+showRoom.address);
   System.out.println("The Owner Name of the ShowRoom is "+showRoom.ownerName);
   System.out.println("The Contact Number of the ShowRoom is "+ showRoom.contactNumber);
   System.out.println("==============================================================");
   
   ShowRoom   showRoom1 = new ShowRoom();
   showRoom.name= "Yamaha";
   showRoom.id= 43563424l;
   showRoom.address = "Dasarahalli";
   showRoom.ownerName = "Ganesh Kumar";
   showRoom.contactNumber = 9879879870l;
   
   System.out.println("The name of the ShowRoom is "+showRoom.name);
   System.out.println("The ID of the ShowRoom is "+showRoom.id);
   System.out.println("The Address of the showroom is "+showRoom.address);
   System.out.println("The Owner Name of the showroom is "+showRoom.ownerName);
   System.out.println("The Contact Number of the ShowRoom is "+showRoom.contactNumber);
   System.out.println("=============================================================");
 
   
   }
 

}