public class BackAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;



    public BackAccount(double balance, String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }





    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {

        if(amount >= this.balance) {
            System.out.println("Can't exceed amount");
        } else {
            System.out.println("Amount withdrawn: " + amount);
            this.balance -= amount;
        }
        System.out.println("You have " + this.balance + " left.");

    }

    public void getAccountSummary() {
    
        System.out.printf("***ACCOUNT DETAILS***\nAccount Number : " + accountNumber + "\nName : " + accountHolderName + "\nBalance : " + balance + "\n");
        
    }



}
