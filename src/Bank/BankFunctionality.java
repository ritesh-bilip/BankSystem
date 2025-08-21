package Bank;

import java.util.Scanner;

public  class BankFunctionality extends BankAccount {
    static Scanner sc=new Scanner(System.in);
    private  long loanAmount;
    public BankFunctionality(String accountHolderName, int age, long adharNumber, long phonenumber, int minimumDeposite,long loanAmount,long AccountNumber) {
        super(accountHolderName, age, adharNumber, phonenumber, minimumDeposite,AccountNumber);
        this.loanAmount=loanAmount;
    }
    public BankFunctionality(){

    }

    public long getLoanAmount() {
        return loanAmount;
    }


    public void  homeLoan(){
        System.out.println("How much loan you want: ");
        loanAmount= sc.nextLong();
        System.out.println("Time preiod : 1. 10 years 2. 15 years 3. 20 years 4. 25 years");
        int timePreiod= sc.nextInt();
//        long granterAccounNumber;
        String granterName;
        int granterAge;
        long adharNumber;
        long phoneNumber;
        String bankName;
        String ifcCode;
        String granterAccounNumber;
        switch (timePreiod){
            case 1:
                System.out.println("-------Enter Garenter Details--------");
                System.out.println("Enter Granter Name: ");
                granterName= sc.nextLine();
                System.out.println("Enter Granter age: ");
                granterAge= sc.nextInt();
                System.out.println("Enter Granter AdharNumber: ");
                adharNumber=sc.nextLong();
                System.out.println("Enter Granter PhoneNumber: ");
                phoneNumber= sc.nextLong();
                System.out.println("------Granter Bank Details----");
                System.out.println("Enter Bank Name: ");
                bankName=sc.nextLine();
                System.out.println("Enter IFC Code: ");
                ifcCode=sc.nextLine();
                System.out.println("Enter AccountNumber: ");
                granterAccounNumber= sc.nextLine();
                BankLoans bankLoans= new BankLoans(granterName,granterAge,adharNumber,phoneNumber,bankName,ifcCode,granterAccounNumber);
        }
    }
    public void loan(long accountNumber ){
        System.out.println("Enter your AccountNumber: ");
    }
}
