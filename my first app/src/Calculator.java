import java.io.*;

public class Calculator {
//    public static void main(String args[])
    private int add(int a,int b){
        return a+b;

    }
    private int multiply(int a,int b){
        return a*b;
    }
    private int divide(int a,int b){
        return a/b;

    }
    private int subtract(int a,int b){
        return a-b;

    }


    public int sum(int n[]){
        int result =0;
        for (int i=0;i<n.length;i++){
            result= add(result, n[i]);
        }
        return result;
    }


//    SUBTRACT METHOD;
    public int subtract(int n[]){
    int result =0;
    for (int i=0;i<n.length;i++){
        result= subtract(result, n[i]);
    }
    return result;
}

//    MULTIPLICATION
public int multiply(int n[]){
    int result =1;
    for (int i=0;i<n.length;i++){
        result= multiply(result, n[i]);
    }
    return result;
}



    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int numbers[] = {8,5,9,90,56};
        System.out.println(calculator.sum(numbers));
        System.out.println(calculator.subtract(numbers));
        System.out.println(calculator.multiply(numbers));

    }
}




