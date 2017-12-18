package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //using for loop
        //Using For loop
        int output = 5;
        for(int i=5; i>1; i--){
            output *=(i-1);
        }
        System.out.println("Factorial of 5!: "+output);

        int factorial = fact(5); // calling recursive method
        System.out.println("Factorial is: "+factorial);

    }
    //Using Recursion
    static int fact(int n){
        int output;
        if(n==1){
            return 1;
        }
        output =fact(n-1)*n; //Recursion
        return output;
    }
}


