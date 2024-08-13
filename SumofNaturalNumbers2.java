public class SumofNaturalNumbers2 {
    
    public static void main(String[] args) {
        
        int i;
        int num=100;
        int sum=0;

        i=1;
        while(i<=num)
        {

            i=i+1;          // i++;        
            sum=sum+i;
            
            System.out.println("sum of the natural numbers between 1 to 100 is:" +sum);

            


        }


    }
}
