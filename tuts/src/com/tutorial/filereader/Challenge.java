package com.tutorial.filereader;
import java.io.*;

public class Challenge {
    public void data() throws IOException {
//        InputStream fn = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("test.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int i=0;
            while ((i=fin.read())!=-1){
                System.out.print((char)i);

            }



        } finally {

                if (fin.read()!=-1){
                    fin.close();
                }
            }
        }


        }
