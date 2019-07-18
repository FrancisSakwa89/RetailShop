package com.tutorial.filereader;

import java.io.*;

public class BuffReadWrite {
    public void mwalimuCode()

    {
        InputStream in = null;
        BufferedInputStream bfn = null;

        try {
            in = new FileInputStream("test.txt");
            bfn = new BufferedInputStream(in);


            while (bfn.available() > 0) {
                char c = (char) bfn.read();
                System.out.println("char: "+c);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bfn!=null){
                try {
                    bfn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
