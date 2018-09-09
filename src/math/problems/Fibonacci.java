package math.problems;

public class Fibonacci {

    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;

    public static void printFib(int n){


       if(n>0){
           n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
           System.out.print(n3 +" ");
           printFib(n-1);
       }

    }

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */

         printFib(40);

    }
}
