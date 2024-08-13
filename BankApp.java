class BankAccount{

    private double balance;

    public BankAccount(double openingBalance){
        
        this.balance=openingBalance;

    }

    public void deposit(double amount)
        {
            
            balance=balance+amount;

        }


        public void withdraw(double amount)
            {
                

                balance=balance-amount;

            }
    

            public void display()
                {

                    System.out.println("balance :" +balance);
                

                }

}

class BankApp
{
    

    public static void main(String[] args) 
    {
        
        BankAccount ba1 = new BankAccount(100.00); // create acct
        System.out.println("Before transactions, ");
        ba1.display(); // display balance
        ba1.deposit(74.35); // make deposit
        ba1.withdraw(20.00); // make withdrawal

        System.out.println("After transactions, ");
        ba1.display(); 


    }

}
