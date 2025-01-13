package Loops;

public class JavaLoops {

public static  void main(String[] args){

    System.out.println("On this day of christmas my true love gave to me " + daysOfChristmasSong(1));
}

 public static String daysOfChristmasSong(int day){

     switch (day) {
         case 1 -> {
             return "A new job foreign remote job";
         }
         case 2 -> {
             return "A new macbook pro system";
         }
         case 3 -> {
             return "A new sam samsung phone";
         }
         case 4 -> {
             return "New business to start with";
         }
         case 5 -> {
             return "A new car to move around";
         }
         case 6 -> {
             return "A new house to live in";
         }
         case 7 ->{
             return "A relocation location visa";
         }
         case 8 -> {
             return "New shoes to use around";
         }
         case 9 -> {
             return "New clothes to wear around";
         }
         case 10 -> {
             return  "A new habit for the new year";
         }
         case 11 -> {
             return "Free food for the whole year";
         }
         case 12 -> {
             return "New heart to help others";
         }
         default -> {
             return "Invalid number choose between numbers 1 to 12";
         }
     }
 }
}
