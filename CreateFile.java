import java.io.File;
import java.io.IOException;
class CreateFile
{

    public static void main(String[] args)
        {


            File file=new File("D:\\Users\\Rashik Timalsina\\Desktop\\HelloWorld.txt");
            try {
                if(file.createNewFile())
                {

                        System.out.println("File Created Successfully" +file.getName());


                }
                else{

                    System.out.println("File Already Exists");

                }
            } catch (IOException e) {
                
                System.out.println("An error occured : " +e.getMessage());

            }

        }


}