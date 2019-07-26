package com.company.FileWriter;
import java.io.*;

public class WriteFile {
    BufferedWriter bw = null;




    {
        String mycontent = "This string would be written into the specified file" + " ama nadanganya??";

        File file = new File("my file.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


            FileWriter fw = null;
            try {
                fw = new FileWriter(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            bw = new BufferedWriter(fw);
            try {
                bw.write(mycontent);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("File written successfully");

        }

            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }

        }

    }
