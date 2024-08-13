 class SumofNaturalNumbers5 {
    
    static int naturalNumbers(int num)
    {

        return num*(num + 1)/2; 

    }

    public static void main(String[] args) {
        
        int num=10;

        System.out.println("Sum of natrual numbers between 1 to 10 is :" +naturalNumbers(num));

    }



}
