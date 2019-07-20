import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboard = null;
        FileWriter out = null;

        try {
            keyboard = new InputStreamReader(System.in);
            System.out.println("Enter 'q' to exit");

            char c;
            do {
                c = (char) keyboard.read();
                System.out.print(c);
            }
            while (c != 'q');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (keyboard != null) {
                keyboard.close();

            }
        }
    }
}
