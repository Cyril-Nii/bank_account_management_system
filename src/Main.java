public class Main {

    public static void main(String[] args) {

    BackAccount Cyril = new BackAccount(100, "Cyril Nii Teiko Tagoe","0233421");

    //Deposit an amount of 500
    Cyril.deposit(500);
    System.out.println(Cyril.getBalance());

    //Withdraw 200
    Cyril.withdraw(200);

    //Give me my account details
    Cyril.getAccountSummary();


    }


}
