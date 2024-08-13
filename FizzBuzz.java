import java.util.Scanner;
class FizzBuzz
{

    public static void main(String[] args) {
        
        int num;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        num=in.nextInt();
        
        if(num % 5 == 0 && num % 3 ==0)
        System.out.println("FizzBuzz");

        else if(num % 5==0)
        System.out.println("Fizz");

        else if(num % 3==0)
        System.out.println("Buzz");

        else
        System.out.println(num);
    
    
    }


}