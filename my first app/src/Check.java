import java.util.Scanner;

public class Check {
    public static void main(String args[]){

        int num;
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner (System.in);
        num = input.nextInt();

        System.out.println("The multiple of your no is: "  + (num*num)+   ("because your input was: ")  +  (num));
    }
}
