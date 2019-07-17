public class Exercise {
    public static void main(String args[]) {
        int n, j, k; //define data type

// loop through the array && define our first object i
        for (n = 1; n<= 5; n++) {
//            for (j = 1; j <= i; j++) {

            //instantiate our j integer
            for(j=5; j>=n; j--)
            {
                //print both sides of the triangle
                System.out.print(" ");
            }
            //get the next odd number using (2n-1) method
                for (k = 1; k <= (2*n-1); k++) {

//print the stars
                    System.out.print("*");
                }
                //print the next line continously
                System.out.println();

            }
        System.out.println("(Equlateral triangle)");
        }

    }
