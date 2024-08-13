import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry; // Import Entry from java.util to use in the HashMap

class Account {

    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs' ###,##0.00");

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calcCheckingWithdrawal(double amount) {
        checkingBalance -= amount;
        return checkingBalance;
    }

    public double calcSavingWithdrawal(double amount) {
        savingBalance -= amount;
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount) {
        checkingBalance += amount;
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount) {
        savingBalance += amount;
        return savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance : " + moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account: ");
        double amount = sc.nextDouble();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdrawal(amount);
            System.out.println("New Checking Balance : " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving account balance: " + moneyFormat.format(savingBalance));
        System.out.print("Amount you want to withdraw from Saving Account: ");
        double amount = sc.nextDouble();
        if ((savingBalance - amount) >= 0) {
            calcSavingWithdrawal(amount);
            System.out.println("New Saving Balance : " + moneyFormat.format(savingBalance) + "\n");
        } else {
            System.out.println("Balance cannot be negative ");
        }
    }
}

class OptionMenu extends Account {

    Scanner msc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'Rs' ###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();

    public OptionMenu() {
        // Initialize valid login info in the constructor
        data.put(1234, 0000);
        data.put(12345, 1111);
        data.put(123456, 2222);
        data.put(1234567, 3333);
    }

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                System.out.println("Welcome to the ATM project ");
                System.out.print("Enter your customer number: ");
                setCustomerNumber(msc.nextInt());
                System.out.print("Enter your pin number: ");
                setPinNumber(msc.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid Characters. Only numbers are allowed.");
                x = 2;
            }
            for (Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("Wrong customer number or pin number ");
        } while (x == 1);
    }

    public void getAccountType() {
        System.out.println("Select the account you want to access");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.print("Choice: ");
        int selection = msc.nextInt();

        switch (selection) {
            case 1:
                getCheckingWithdrawInput();
                break;
            case 2:
                getSavingWithdrawInput();
                break;
            case 3:
                System.out.println("Thank you for using ATM ");
                break;
            default:
                System.out.println("Invalid choice ");
                getAccountType();
        }
    }
}

public class ATMProject {
    public static void main(String[] args) throws IOException {
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.getLogin();
    }
}
