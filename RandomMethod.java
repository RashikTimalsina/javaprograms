import java.util.prefs.BackingStoreException;

public class RandomMethod {
    
    public static void main(String[] args) {
        
        int min=100;
        int max=500;

        System.out.println("Random Value of type double between " +min +"to" + max);
        double a=Math.random()*(max-min+1)+min;
        System.out.println(a);

        System.out.println("Random number value of type int between" + min +"to" +max);
        int b=(int)Math.random()*(max-min+1)+min;
        System.out.println(b);



    }

}
