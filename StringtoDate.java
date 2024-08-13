import java.util.Date;
import java.text.SimpleDateFormat;

class StringtoDate{

    public static void main(String[] args) throws Exception   
    {

        String str="28/02/2021";        //throws exception should be written with main method
        Date d=new SimpleDateFormat("dd/MM/yyyy").parse(str);

        System.out.println(str + "\t" +d);


    }

}