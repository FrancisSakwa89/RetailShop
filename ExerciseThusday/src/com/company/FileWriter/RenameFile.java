package com.company.FileWriter;

import java.io.File;

public class RenameFile {
    {
        File oldfile = new File("franco.txt");

        File newfile = new File("ndugwe.txt");

        boolean flag = oldfile.renameTo(newfile);

        if (flag) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Renaming operation failed !");
        }
    }
}
