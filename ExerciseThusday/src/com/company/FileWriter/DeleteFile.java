package com.company.FileWriter;
import java.io.File;

public class DeleteFile {

    {
        File file = new File("me.txt");

        if(file.delete()){
            System.out.println(file.getName() + " is deleted !");
        }
        else{
            System.out.println("Delete failed: File didn't delete because file doesn't exist");
        }
//        System.out.println("Exception occurred");
    }
    }




