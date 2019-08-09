package com.tutorial;

import com.tutorial.filereader.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
/*  We call the class name here */

        InputUser inputUser= new InputUser();
        /* We now call a method name*/
         inputUser.writeFile();
        BuffReadWrite buffReadWrite = new BuffReadWrite();
        buffReadWrite.mwalimuCode();
        Challenge challenge = new Challenge();
        challenge.data();
        BikePolymoExample.Splendor splendor = new BikePolymoExample.Splendor();
        splendor.run();
        EmployeeInherit.Programmer programmer = new EmployeeInherit.Programmer();
        System.out.println("Programmer salary is: "+ programmer.salary);
        System.out.println("Programmer bonus is: "+ programmer.bonus);
        BikeAbstract obj = new BikeAbstract() {
            @Override
            public void run() {

            }
        };
        obj.run();
        obj.changeGear();


    }
}

