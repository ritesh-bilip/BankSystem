package Bank;

import java.util.Random;
import java.util.Scanner;

public class BankOfIndia extends AccountFunctionality {
    Scanner sc=new Scanner(System.in);
    private String accountHolderName;
    private int Age;
    private long AdharNumber;
    private long Phonenumber;
    private int minimumDeposite;
    private String AccountNumber;

    public BankOfIndia(String accountHolderName, int age, long adharNumber, long phonenumber, int minimumDeposite, String AccountNumber) {
        super(accountHolderName, age, adharNumber, phonenumber, minimumDeposite, AccountNumber);
    }

    public BankOfIndia() {

    }

    public String accountNumberCreate(){
        Random rand = new Random();
        int number = 100000000 + rand.nextInt(900000000);
        // Generate a random uppercase character
        char letter = (char) ('A' + rand.nextInt(26));
        // Combine and print
        String result = number + String.valueOf(letter);
        return result;
    }
    public void accountCreate(){
        System.out.println("-----------------WelCome To Bank Of India--------------");
        System.out.println("Enter Your Name: ");
        accountHolderName=sc.nextLine();
        System.out.println("Enter your age: ");
        Age=sc.nextInt();
        System.out.println("Enter Phone Number: ");
         Phonenumber= sc.nextLong();
        System.out.println("Enter Aadhaar Nuumber: ");
        AdharNumber=sc.nextLong();
        System.out.println("Enter Minimum Deposite: ");
        minimumDeposite= sc.nextInt();
        AccountNumber=accountNumberCreate();
        BankOfIndia bankOfIndia=new BankOfIndia(accountHolderName,Age,AdharNumber,Phonenumber,minimumDeposite,AccountNumber);
        setAccountHolderName(accountHolderName);
        setAge(Age);
        setPhonenumber(Phonenumber);
        setAdharNumber(AdharNumber);
        setMinimumDeposite(minimumDeposite);
        setAccountNumber(AccountNumber);
        System.out.println("Account create sucessfully");
        System.out.println("-------Bank Of India-------");
        bankOfIndia.showAccount();
    }
    public void accountFuntionality(){
        String choiceAgain;
        do {
            System.out.println("--------Bank Of India Account  Services-------");
            System.out.println("1.Deposit\n2.Check Balance\n3.WithDrawl Cash\n3.Transfer cash");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    Deposit();
                    break;
                case 2:
                    CheckBalance();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    TransferMoney();
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do You want to check services?(y/n)");
            choiceAgain= sc.nextLine();
        }while (choiceAgain.equals("y"));
    }
    public void bankServices(){
        System.out.println("--------Welcome to Bank Of India Loan Services");
        System.out.println("1. Home Loan\n2. Personal Loan\n3. Education Loan\n4. Business loan");
        int choice= sc.nextInt();
        BankLoans bankLoans=new BankLoans();
        switch (choice){
            case 1:
                bankLoans.HomeLoan();
                break;
            case 2:
                bankLoans.PersonalLoan();
                break;
            case 3:
                bankLoans.Education();
                break;
            case 4:
                bankLoans.Business();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
