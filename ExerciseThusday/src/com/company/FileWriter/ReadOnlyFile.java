package com.company.FileWriter;

import java.io.File;

public class ReadOnlyFile {

    {
        File file = new File("Readonly.txt");

        boolean flag = file.setReadOnly();

        if(flag==true){
            System.out.println("File successfully converted to read only mode");

        }
        else{
            System.out.println("Unsuccessful operation !");
        }
    }
}
