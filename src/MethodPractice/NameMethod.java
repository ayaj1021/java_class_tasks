package MethodPractice;

public class NameMethod {

    public  static  void main(String [] args){

        System.out.println(greetUser("John,"));

        int result =   multiplyNumber(3, 8);
        int secondResult = multiplyNumber(3,2,6);
        int largestNumber=  getLargestNumber(10,6, 17);
        double radius = 5.0;

        System.out.println("This is first result: " + result);

        System.out.println("This is second result: " + secondResult);

        System.out.println("The largest number is: " + largestNumber);

        System.out.println("The area of the circle with radius " + radius + " is: " + calculateArea(radius));


    }

    //Write a static method that takes a user's name as parameter and prints personalized greeting
    public static String greetUser(
            String userName
    ){
        return "Hello " + userName + " You are welcome";
    }

    //Define two methods with the same name that multiplies given number
    public static  int multiplyNumber(int a, int b){
        return a * b;
    }

    public static  int multiplyNumber(int a, int b, int c){
        return a * b * c;
    }

    //Write a method that returns the largest of 3 given numbers
    public  static  int getLargestNumber(int num1, int num2, int num3){
        return  Math.max(num1, Math.max(num2, num3));
    }

    public static double calculateArea(double radius) {

        return Math.PI * Math.pow(radius, 2);
    }
}
