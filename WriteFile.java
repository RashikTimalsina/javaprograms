import java.io.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    
    public static void main(String[] args) {
        
        try
        {
            FileWriter writer =new FileWriter("D:\\Users\\Rashik Timalsina\\Desktop\\HelloWorld.txt");
            writer.write("Hello, this is my File Handling!");
            writer.close();

            System.out.println("Data written to the file ");

        }

        catch(IOException e)
            {
                
                System.out.println("An error occurred : " +e.getMessage());

            }

    }


}
