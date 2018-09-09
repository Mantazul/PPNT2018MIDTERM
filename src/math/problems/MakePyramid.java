package math.problems;

public class MakePyramid {

    public static void MakePyramid(int n){
        int k = 2*n-2;
        for (int i = 0; i < n; i++){

            for (int j = 0; j<k;j++){
                System.out.print(" ");
            }

            k = k-1;

            for (int a = 0;a < i; a++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

        MakePyramid(7);


        }
  }
