package Java;

public class NumberFormatException {
    
    public static void main(String[] args) {
        
        String str="Hello";      // Here String is a text which we want to convert in int value
        int i=Integer.parseInt(str);

        System.out.println(i);      //The error here occurs is called NumberformatException where a text string value cannot be converted into int value

    }

}
