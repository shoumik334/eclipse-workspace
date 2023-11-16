package File_handaling;
import java.io.*;

public class File1 {

    public static void main(String[] args) {

        try {
           FileWriter myFile = new FileWriter("name.txt");

            
            myFile.write("Its ok 33 o ok ok");
            myFile.close();
            
            System.out.println("Code run Succecfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
