package Encapsulation;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyDriver{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String bankName = "STATE BANK OF INDIA", branchName = "DECCAN", add = "2nd FLOOR DECCAN BUS STOP";
        MyBank b = new MyBank(bankName, branchName, add);
        System.out.println();
        System.out.println("WELCOME");
        System.out.println("Bank Name : " + bankName);
        System.out.println("Branch Name : " + branchName);
        System.out.println("Address : " + add);
        System.out.println("Select from Below Option");
        for (;;) {

        System.out.println("1. Create Account");
        System.out.println("2. Remove Account");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Withdraw Cash");
        System.out.println("5. Check Account Balance");
        System.out.println("6. Exit");
        System.out.print("Enter an option : ");
        int option = sc.nextInt();
        switch (option) {
        case 1:
        b.createAccount();
        break;
        case 2:
        b.removeAccount();
        break;
        case 3:
        b.deposite();
        break;
        case 4:
        b.withdraw();
        break;
        case 5:
        b.bal();
        break;
        case 6:
        System.out.println("You have exited");
        System.exit(0);
        } sc.close();
        }
        
    }
    
}
class MyAccount{
    private String name,ifsc;
    private long phone, accountno;
    private double balance;
    private int pin;

    MyAccount(String name, String ifsc, long phone, long accountno, double bal, int pin){
        this.name = name;
        this.ifsc = ifsc;
        this.phone = phone;
        this.accountno = accountno;
        this.balance = bal;
        this.pin = pin;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIfsc(){
        return ifsc;
    }

    public long getPhone(){
        return phone;
    }

    public void setPhone(long phone){
        this.phone = phone;
    }

    public long getAccountno(){
        return accountno;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getPin(){
        return pin;
    }

    public void setPin(int pin){
        this.pin = pin;
    }
}

class MyBank{
    MyAccount b;
    static long accountno, phone;
    String bankName, branchName, address;

    Scanner sc = new Scanner(System.in);
    
    MyBank(String bankName, String branchName, String address){
        this.bankName = bankName;
        this.branchName = branchName;
        this.address = address;
    }

    public void createAccount(){
        long a = ThreadLocalRandom.current().nextInt(10000);
        accountno = a * a * a;
        String ifsc = "SBIN0012013";

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your phone number:");
        phone = sc.nextLong();
        System.out.println("Your account number is  : " + accountno);
        System.out.println("Your IFSC code is : " + ifsc);
        System.out.println("Enter your initial balance:");
        double bal = sc.nextDouble();
        System.out.println("Set your 4 digit pin:");
        int pin = sc.nextInt();

        b = new MyAccount(name, ifsc, phone, accountno, bal, pin);
        System.out.println("Your account details are:");
        System.out.println("Name: " + b.getName());
        System.out.println("Phone: " + b.getPhone());
        System.out.println("Account Number: " + b.getAccountno());
        System.out.println("Account created succesfully");

        System.out.println();
    }

    public void removeAccount(){
        System.out.println();
        if(b != null){
            System.out.println("Enter your account number or phone number:");
            long accountno = sc.nextLong();
            if (accountno == b.getAccountno() || accountno == b.getPhone()){
                System.out.println("Enter your pin: ");
                int pin = sc.nextInt();
                if (pin == b.getPin()){
                    b = null;
                    System.out.println("Account removed successfully");
                } else {
                    System.out.println("Enter pin is wrong");
                }
 
            }
            else{
                System.out.println("Account not found");
            }
            
        }
        System.out.println();
    }

    public void deposite(){
        System.out.println();
        if(b != null){
            System.out.println("Enter your account no or phone no:");
            long accountno = sc.nextLong();
            if (accountno == b.getAccountno() ||  accountno == b.getPhone()){
                System.out.println("Account holder name: " + b.getName());
                System.out.println("Press 1 to continue and 2 to exit: ");
                int press = sc.nextInt();
                if (press == 1){
                    System.out.println("Enter the amount to deposite: ");
                    double amount = sc.nextDouble();
                    if(accountno == b.getAccountno()){
                        double newBal = b.getBalance() + amount;
                        b.setBalance(newBal);
                        System.out.println("The " + amount + "Rs added Succesfully");
                    }
                }
            } else {
                System.out.println("Enter account number is wrong");
            }
        }
        else{
            System.out.println("First you have to create the bank account");
        }
        System.out.println();

    }
    public void withdraw() {
            System.out.println();
            if (b != null) {
            System.out.print("Enter Your Account No. OR Phone No. : ");
            long accountno = sc.nextLong();
            if (accountno == b.getAccountno() || accountno == b.getPhone()) {
            System.out.print("Enter the Amount to Withdraw : ");
            double amount = sc.nextDouble();
            System.out.print("Enter Your PIN : ");
            int pin = sc.nextInt();
            if (b.getBalance() >= amount) {
            if (pin == b.getPin()) {
            System.out.println(amount + " debited Sucessfully");
            double newbal = b.getBalance() - amount;
            b.setBalance(newbal);
            } else {
            System.out.println("Enter PIN is wrong");
            }
            } else {
            System.out.println("Enter Amount is more than Bank Balances");
            }
            } else {
            System.out.println("Enter Account No. doesn't exist");
            }
            } else {




            System.out.println("First You have to create the Bank Account");
            }
            System.out.println();
        }
    
    public void bal(){
        System.out.println();
        if(b != null){
            System.out.println("Enter your account no or phone no:");
            long accountno = sc.nextLong();
            if (accountno == b.getAccountno() ||  accountno == b.getPhone()){
                System.out.println("Account holder name: " + b.getName());
                System.out.println("Press 1 to continue and 2 to exit: ");
                int press = sc.nextInt();
                if (press == 1){
                    System.out.println("Your bank balance is: " + b.getBalance());
                }
            } else {
                System.out.println("Enter account number is wrong");
            }
        }
        else{
            System.out.println("First you have to create the bank account");
        }
        System.out.println();
    }
}
