import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class DatetoString{

    public static void main(String[] args)
        {

            Date date=Calendar.getInstance().getTime();         //Giving a call
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String str= dateFormat.format(date);

            System.out.println("Converted String :" +str);




        }


}