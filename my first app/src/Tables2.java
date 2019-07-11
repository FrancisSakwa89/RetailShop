import java.util.Scanner;

public class Tables2 {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter your integer: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

//        int num !=3;
//        int i=num;
        if(num % 2 == 0){
            System.out.println("Ndugwe 2 says: " +(num) +  " Is an even number");;
        }
        else{
            System.out.println("Number is odd !!"  +  " because your input was: " + (num));
        }
    }

}