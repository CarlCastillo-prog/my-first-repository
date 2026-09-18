public class Main {

   public static void main(String[] args){
   
   Movie movie1 = new Movie();
   movie1.title = "Spider-Man";
   movie1.genre = "Action";
   movie1.duration = 121;
   
   movie1.displayInfo();
   
   Movie movie2 = new Movie();
   movie2.title = "Spider-Man 2";
   movie2.genre = "Superhero";
   movie2.duration = 127;
   
   movie2.displayInfo();
   
   Movie movie3 = new Movie();
   movie3.title = "Spider-Man: No Way Home";
   movie3.genre = "Adventure";
   movie3.duration = 148;
   
   movie3.displayInfo();
   
   }
}