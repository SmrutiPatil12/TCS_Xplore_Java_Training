package ClassesAndObjects.BankDemo;

public class Bank {

    public static void main(String[] args) {

        Account account1 = new Account();

        account1.accountNumber = 101;
        account1.accountHolderName = "Smruti Patil";
        account1.balance = 50000.0;
        account1.accountType = "Savings";

        System.out.println("Account Number : " + account1.accountNumber);
        System.out.println("Account Holder Name : " + account1.accountHolderName);
        System.out.println("Balance : " + account1.balance);
        System.out.println("Account Type : " + account1.accountType);
    }
}