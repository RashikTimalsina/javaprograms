class AssignmentOperator
{
    

    public static void main(String[] args)
    {

        int num1=10;
        int num2=20;
        int num3=30;

        System.out.println("num1 :" +num1);
        System.out.println("num2 :" +num2);


         num1+=num2;                    //10+20=30;
        System.out.println("New num1: " +num1);


        num3-=num1;
        System.out.println("New num2 :" +num2);

        num2=-(num2);
        System.out.println(num2);

    }


}