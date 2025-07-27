package learn.dsa.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\dnagasre\\OneDrive - " +
                "Capgemini\\Documents\\DSA\\DSA\\src\\main\\java\\learn\\dsa\\IO\\test");
        try(FileReader fileReader = new FileReader(file)){
            int i;
            while((i = fileReader.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
