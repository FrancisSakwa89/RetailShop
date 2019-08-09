package com.tutorial.ImageProcessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GrayScale {
    BufferedImage img = null;
    File f = null;


    public void readImage(){
        try {
            f = new File("/home/moringaschool/Documents/teen_kids_1.jpg");
            img = ImageIO.read(f);
        } catch (IOException e) {
            e.printStackTrace();
        }


        int width = img.getWidth();
        int height = img.getHeight();


        for (int i=0; i<height;i++){
            for (int x=0; x< width;x++){

                int p = img.getRGB(x,i);
                int a = (p >> 24)& 0xff;
                int r = (p >> 16)& 0xff;
                int g = (p >> 8)& 0xff;
                int b = p & 0xff;



                int avg = (r+g+b)/3;

                p = (a <<24) | (a<<16) | (avg<<8) | avg;

                img.setRGB(x,i,p);

            }
        }

        try {
            f = new File("out.jpg");
            ImageIO.write(img, "jpg",f);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
