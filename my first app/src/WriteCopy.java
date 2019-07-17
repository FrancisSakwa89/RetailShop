import java.io.*;

class WriteCopy {

    public static void main(String args[]) throws IOException {
        FileOutputStream out = new FileOutputStream("writefile.txt");

        try {
            int i;
            for (i= 0;i<=1000;i++) {
                out.write(String.valueOf(i).getBytes());
            }}
            finally{

                if (out != null) {
                    out.close();
                }
            }
        System.out.println("successful written in:");

    }
    }

