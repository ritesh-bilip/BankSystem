package Bank;

import java.util.Scanner;

public  class AccountFunctionality extends BankAccount {
    static Scanner sc=new Scanner(System.in);
    private int balance;
    public AccountFunctionality(String accountHolderName, int age, long adharNumber, long phonenumber, int minimumDeposite,long AccountNumber) {
        super(accountHolderName, age, adharNumber, phonenumber, minimumDeposite,AccountNumber);
        this.balance=minimumDeposite;
    }
    public  AccountFunctionality(){

    }

    public  int Deposit(long accountNumber,int balance ){
        System.out.println("Enter your Account: ");
        long check=sc.nextLong();
        if (accountNumber==check){
            System.out.println("Enter Deposit Amount: ");
            int deposit= sc.nextInt();
            balance=getMinimumDeposite()+deposit+balance;
        }else {
            System.out.println("Invalid Bank Account  Number");
        }
        return balance;

    }

    public  void Withdraw(){
        System.out.println("Enter your Account: ");
        long check=sc.nextLong();
        if (getAccountNumber()==check){
            System.out.println("Enter withdraw Amount: ");
            int deposit= sc.nextInt();
            if (deposit>balance){
                System.out.println("Insuficiant Balance!");
            }else {
                balance=balance-deposit;
                System.out.println("Withdrawal Complete ! your Account balance :"+balance);
            }
        }else {
            System.out.println("Invalid Bank Account  Number");
        }

    }
    public void CheckBalance(){
        System.out.println("Enter your Account Number: ");
        long check= sc.nextLong();
        if(check==getAccountNumber()){
            System.out.println(getAccountHolderName()+" , your  current balance : "+balance);
        }else {
            System.out.println("Invalid AccountNumber");
        }
    }
    public void TransferMoney(){
        System.out.println("Enter your Account Number: ");
        long check= sc.nextLong();
        if (check==getAccountNumber()){
            System.out.println("Enter Sender  Account Number: ");
            long check2= sc.nextLong();
            System.out.println("Enter Transfer Amount: ");
            int transferMoney=sc.nextInt();
            if (transferMoney>balance){
                System.out.println("Insuffitiaent balance");
            }else {
                balance=balance-transferMoney;
                System.out.println("Transfer Successfully ");
            }
        }
    }

}