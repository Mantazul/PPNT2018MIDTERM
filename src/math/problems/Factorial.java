package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static int recFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * recFactorial(n-1);
    }

    public static int Factorial(int n){
        int total = n;
       for (int i = n-1; i >=1;i--){
           total = total*i;
       }
        return total;
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println(recFactorial(5));
        System.out.println(Factorial(5));


    }
}
