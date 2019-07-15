public class Pyramid {
    public static void main(String args[]) {
        int i, j, k;

// The upper part of the triangle
        for (i = 1; i<= 3; i++) {
//            for (j = 1; j <= i; j++) {
            for(j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= (2*i-1); k++) {

                System.out.print("*");
            }
            System.out.println();

        }
        // The lower part of the triangle
        for (i = 2; i>=1; i--) {
//            for (j = 1; j <= i; j++) {
            for(j=3; j>=i; j--)
            {
                System.out.print(" ");
            }
            for (k =(2*i-1); k >=1 ; k--) {

                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\n############################## (Diamond)");
    }

}