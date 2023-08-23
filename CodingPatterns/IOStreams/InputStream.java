package IOStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args) throws IOException {

        byte[] array = new byte[100];

        try {
            FileInputStream input = new FileInputStream("IOStreams/input.txt");

            System.out.println("Available bytes in this file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read!");

            // Convert byte array to string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
