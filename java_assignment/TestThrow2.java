import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2 {
    
    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("/home/rahul/Desktop/abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Rest of the code...");
    }
}
