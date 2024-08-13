import java.util.Scanner;
class SumofNaturalNumbers3 {
    
    public static void main(String[] args) {
        
        int i;
        int num;
        int sum=0;

        Scanner in=new Scanner(System.in);

        System.out.println("Sum starting from :" );
        i=in.nextInt();

        System.out.println("Sum ending to :");
        num=in.nextInt();

        while(i<=num)
        {

         sum=sum+i;
         i++;

            System.out.println("Sum of natural numbers between :" +sum);

        }

    }

}
