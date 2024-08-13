import java.io.*;
import java.io.IOException;
public class WriteFile2 {
    
    public static void main(String[] args) {

        try
        {
        
                FileWriter f=new FileWriter("D:\\Users\\Rashik Timalsina\\Desktop\\HelloWorld.txt");
                try{

                                f.write("Java is the best programming language !");
                        
                            }
        
                        finally{

                                f.close();
                                
                        }

                        System.out.println("Data written successfully");

    }

    catch(IOException i)
        {

            System.out.println(i);

        }


}

}
