public class Methods {
    public static  void main(String[] args){


//        Methods methods = new Methods();
//        methods.addNumbers(5, 7);
          addNumbers(5, 7);

        System.out.println("Result: " +addNumbers(4, 6));

    }

    //Recursive method.(This is a method that calls itself)

    public  int factorial(int n){
        if (n == 0){
            return  1;
        }
        return  n * factorial(n - 1);
    }

    //To create a method,
    // declare an access modifier
    //return type
    //name of method
    //parameters

    public static int addNumbers(int a, int b){
        return a + b;
    }

}


//There are four types of accessors in Java
//Public ==> Accessed from anywhere
//Protected ==> Accessed within a same package pr subclass
//Private ==> Accessed within the class it's created
//default ==> Accessed only within the same package