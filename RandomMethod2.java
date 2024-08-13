import java.util.Random;

import javax.swing.plaf.synth.SynthDesktopPaneUI;
public class RandomMethod2 {
 
        public static void main(String[] args) {
            
        Random rn=new Random();

        int x=rn.nextInt(100);      //Int-bound should be mentioned
        int y=rn.nextInt(500);

        System.out.println("Random generated number from 100 to 500");
        System.out.println(x);
        System.out.println(y);
  


        double a=rn.nextDouble();           //No parameters are passed out
        double b=rn.nextDouble();
        System.out.println("Random generated decimal number from 0 to 1");
        System.out.println(a);
        System.out.println(b);


        boolean m=rn.nextBoolean();         // No any parameters are passed out
        boolean n=rn.nextBoolean();
        System.out.println("Random generated boolean values ");
        System.out.println(m);
        System.out.println(n);


        }


}
