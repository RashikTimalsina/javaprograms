class InttoString3{

    public static void main(String[] args)
    {

        int a=100;
        String str=Integer.toString(a);

        System.out.println(str);            //"100"

        System.out.println(a+100);          //200 as performs binary addition
        System.out.println(str+100);        //100100 as performs string concatenation

    }


}