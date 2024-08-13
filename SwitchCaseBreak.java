import java.util.Scanner;
class SwitchCaseBreak{

    public static void main(String[] args) {
        
        char grade;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your grade");

        grade=sc.next().charAt(0);

        switch(grade){
            
            case 'A':

            System.out.println("Excellent");

            break;

            case 'B':

            System.out.println("Very Good");

            break;

            case 'C':

            System.out.println("Average");

            break;

            case 'D':

            System.out.println("Failed");

            break;
        

            default:
            
            System.out.println("Please type valid grades only");

        }
        
    }
}