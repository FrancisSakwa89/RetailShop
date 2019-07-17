public class Reversed {
    public static void main(String rgs[]) {
        int n, j, k; //define data type

        for (n = 4; n>=1; n--) {
//            for (j = 1; j <= i; j++) {
            for(j=3; j>=n; j--)
            {
                System.out.print(" ");
            }
            for (k =(2*n-1); k >=1 ; k--) {

                System.out.print("*");
            }
            System.out.println();

        }

        for (n = 2; n<= 4; n++) {
//            for (j = 1; j <= i; j++) {

            //instantiate our j integer
            for(j=3; j>=n; j--)
            {
                //print both sides of the triangle
                System.out.print(" ");
            }
            //get the next row number using (2n-1) method
            for (k = 1; k <= (2*n-1); k++) {

//print the stars
                System.out.print("*");
            }
            //print the next line continously
            System.out.println();

        }
        System.out.println("\n##########");
    }
    }



