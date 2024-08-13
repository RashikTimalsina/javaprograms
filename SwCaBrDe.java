import java.util.Scanner;
public class SwCaBrDe {
    
    public static void main(String[] args) {
        
        int age;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age");

        age=sc.nextInt();

        switch(age){

            case 210:
            
                
                System.out.println("You are eligible to vote");
                

            }
                break;

            case 2:
            if(age<18){

                System.out.println("Sorry you cannot vote");

            }
                break;

            default:

            System.out.println("Only numbers are allowed");
        }
    }
}
