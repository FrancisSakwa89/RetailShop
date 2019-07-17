package com.tutorial.filereader;

import java.io.*;

public class InputUser {

    public void writeToFile() throws IOException {

        OutputStreamWriter out = null;
        try (InputStreamReader keyboard = new InputStreamReader(System.in)) {
            out = new FileWriter("output.txt");
            System.out.println("Enter some text, 'q' to quit");
            char c;
            do {
                c = (char) keyboard.read();
                out.write(c);
            } while (c != 'q');

        }


    }









    public void writeFile() {
        FileInputStream input = null;
        FileOutputStream output = null;
        File file = null;

        try {
            file = new File("test.txt");
            input = new FileInputStream(file);
            output = new FileOutputStream("testoutput.txt");

            int data;
            while ((data = input.read())!=-1){
                output.write(data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input!= null);{
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (output!= null);{
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}