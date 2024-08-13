import java.lang.*;
import java.util.Scanner;
class VoteNow
{

    public void Voter(){
     
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter your age ");
            int age=sc.nextInt();

            if(age>=18)
            {

                System.out.println("You can vote");

            }
            else{

                System.out.println("You cannot vote");

            }


    }

}

class UserInputPractice
{

    public static void main(String[] args)
        {

        VoteNow vn=new VoteNow();
        vn.Voter();           



        }


}



