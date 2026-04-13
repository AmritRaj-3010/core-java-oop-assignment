//WAP IN JAVA TO CREATE PRIVATE VARIABLE WITH GETTER AND SETTER METHODS
public class BankAccount {
    // Private variables
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Setter for account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        // Setting values using setter methods
        acc.setAccountNumber(12345);
        acc.setBalance(25000.50);

        // Displaying values using getter methods
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}