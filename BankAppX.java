class Bank
{

    private double balance;

    public Bank(double openingBalance)
    {

        this.balance=openingBalance;


    }
    
    public void withdrawal(double amount)
    {
        balance=balance-amount;

    }


    public void deposit(double amount)
        {
            balance=balance+amount;
            
        }


        public void display()
        {

    System.out.println("Balance :" +balance);           

        }

}


class BankAppX
{

    public static void main(String[] args) {
        
    Bank b=new Bank(100000);
    b.withdrawal(20000);
    b.deposit(10000); 
    b.display();       

    }

}