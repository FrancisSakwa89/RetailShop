import com.Exercise.OOPConcepts.Animalheritance.Bird;
import com.Exercise.OOPConcepts.Arithmetism.Adder;
import com.Exercise.OOPConcepts.Arithmetism.MyCalculator;
import com.Exercise.OOPConcepts.Bike.inheritance.Motorcycle;
import com.Exercise.OOPConcepts.InstanceOf.Hacker;
import com.Exercise.OOPConcepts.InstanceOf.Rockstar;
import com.Exercise.OOPConcepts.InstanceOf.Student;
import com.Exercise.OOPConcepts.bookinheritance.MyBook;
import com.Exercise.OOPConcepts.soccerinheritance.Soccer;
import com.Exercise.OOPConcepts.soccerinheritance.Sports;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static com.Exercise.OOPConcepts.InstanceOf.InstanceOfTutorial.count;
import static com.Exercise.OOPConcepts.iterator.Iters.func;

public class Main {
    public static void main(String[] args) {
        System.out.println("#### THIS IS BIRD INHERITANCE ####3");

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("####### THIS IS ARITHMETIC $ ADDER#####");
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");


        System.out.println("####### THIS IS BOOK INHERITANCE #####");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book title: ");
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());


        System.out.println("########## MY CALCULATOR ARITHMETIC########");

        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();

    }


    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);


            System.out.println("####### SOCCER $ SPORTS");
            Sports c1 = new Sports();
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();

            System.out.println("##### MOTORCYCLE INHERITANCE ####");
            Motorcycle M = new Motorcycle();


            System.out.println("###############USING AN INSTANCE OF###############");
            ArrayList mylist = new ArrayList();
            Scanner printer = new Scanner(System.in);
            int t = printer.nextInt();
            for (int k = 0; k < t; k++) {
                String s = printer.next();
                if (s.equals("Student")) mylist.add(new Student());
                if (s.equals("Rockstar")) mylist.add(new Rockstar());
                if (s.equals("Hacker")) mylist.add(new Hacker());
            }
            System.out.println(count(mylist));


            System.out.println("######");
            ArrayList finallist = new ArrayList();
            int n = printer.nextInt();
            int m = printer.nextInt();
            for (int a = 0; i < n; i++) {
                finallist.add(printer.nextInt());
            }

            finallist.add("###");
            for (int a = 0; i < m; a++) {
                finallist.add(printer.next());
            }

            Iterator it = func(mylist);
            while (it.hasNext()) {
                Object element = it.next();
                System.out.println((String) element);
            }
            printer.close();
        }
    }
}










