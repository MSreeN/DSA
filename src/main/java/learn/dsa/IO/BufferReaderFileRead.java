package learn.dsa.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderFileRead {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\dnagasre\\OneDrive - Capgemini\\Documents\\DSA\\DSA\\src\\main\\java\\learn\\dsa\\IO\\test")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println(line);
            line = bufferedReader.readLine();
            System.out.println(line);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }


}
