package IOStreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

    public static void main(String[] args) throws IOException {
        
        String data = "This is an updated text inside the file";

        try {
            FileOutputStream out = new FileOutputStream("IOStreams/input.txt");

            // Convert string to bytes
            byte[] array = data.getBytes();

            // Write data to the output stream
            out.write(array);
            System.out.println("Data is written!");

            // Close the output stream
            out.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
}
