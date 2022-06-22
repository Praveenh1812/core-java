class BookMyMovieTester{

    String movies[] = {"Om","Yajamana","Mandya","Gaalipata","Mungaru Male","Hatavadi","Cheluvina Chithara","Kirik Party"};

   public static void main(String a[]){
BookMyMovie bookMyShow = new BookMyMovie("Urvashi",12);
System.out.println ("Theatre name is "+bookMyShow.theatreName);
System.out.println ("Snacks name name is "+bookMyShow.snackName);

bookMyShow.showTime(10,"Devi","Om");
bookMyShow.buySnacks("Tedhe Medhe",10,60);
bookMyShow.showTime(15,"Praveen","Gaalipata");

bookMyShow.buySnacks("Coca-Coala",10,120);



}

}