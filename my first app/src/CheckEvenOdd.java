import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String args[]){
        int num;
        System.out.println("Enter your integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Number entered is Even" +  num  +  "is even");
        }
        else{
            System.out.println("number entered is odd"  + num  +  "is odd");
        }
    }
}
