import java.util.Date;
import java.text.SimpleDateFormat;

class StringtoDate2{

    public static void main(String[] args) throws Exception{

        String str1="28-Feb-2021";
        String str2="02 28,2021";
        String str3="Sun,Feb 28 2021";
        String str4="Sun,Feb 28 2021 23:11:11";
        String str5="28-Feb-2021 20:12:15";

        SimpleDateFormat format1=new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat format2=new SimpleDateFormat("MM dd,yyyy");
        SimpleDateFormat format3=new SimpleDateFormat("E,MMM dd yyyy");
        SimpleDateFormat format4=new SimpleDateFormat("E,MMM dd yyyy HH:mm:ss");
        SimpleDateFormat format5=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");


        Date date1=format1.parse(str1);
        Date date2=format2.parse(str2);
        Date date3=format3.parse(str3);
        Date date4=format4.parse(str4);
        Date date5=format5.parse(str5);

        System.out.println(str1 +date1);
        System.out.println(str2 +date2);
        System.out.println(str3 +date3);
        System.out.println(str4 +date4);
        System.out.println(str5 +date5);

    }


}