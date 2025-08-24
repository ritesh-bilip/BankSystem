package Bank;

import java.util.Scanner;

public  class BankFunctionality extends BankAccount {
    static Scanner sc=new Scanner(System.in);
    private  long loanAmount;
    public BankFunctionality(String accountHolderName, int age, long adharNumber,
                             long phonenumber, int minimumDeposite,long loanAmount,long AccountNumber) {
        super(accountHolderName, age, adharNumber, phonenumber, minimumDeposite,AccountNumber);
        this.loanAmount=loanAmount;
    }
    public BankFunctionality(){

    }

    public long getLoanAmount() {
        return loanAmount;
    }



    public void  homeLoan(){
        System.out.println("How much Home loan you want: ");
        loanAmount= sc.nextLong();
        String granterName;
        int granterAge;
        long adharNumber;
        long phoneNumber;
        String bankName;
        String ifcCode;
        String granterAccounNumber;
        System.out.println("Enter Your Account Number: ");
        long accountNumber=sc.nextLong();
        if (accountNumber==getAccountNumber()) {
            System.out.println("-------Enter Garenter Details--------");
            System.out.println("Enter Granter Name: ");
            granterName = sc.nextLine();
            System.out.println("Enter Granter age: ");
            granterAge = sc.nextInt();
            System.out.println("Enter Granter AdharNumber: ");
            adharNumber = sc.nextLong();
            System.out.println("Enter Granter PhoneNumber: ");
            phoneNumber = sc.nextLong();
            System.out.println("------Granter Bank Details----");
            System.out.println("Enter Bank Name: ");
            bankName = sc.nextLine();
            System.out.println("Enter IFC Code: ");
            ifcCode = sc.nextLine();
            System.out.println("Enter AccountNumber: ");
            granterAccounNumber = sc.nextLine();
            BankLoans bankLoans = new BankLoans(granterName, granterAge, adharNumber, phoneNumber, bankName, ifcCode, granterAccounNumber);
            System.out.println("Time preiod : 1. 10 years 2. 15 years 3. 20 years");
            int timePreiod = sc.nextInt();
            switch (timePreiod) {
                case 1:
                    bankLoans.setIntersetrateHomeLoan(5.5);
                    bankLoans.HomeLoan();
                    break;
                case 2:
                    bankLoans.setIntersetrateHomeLoan(7.5);
                    bankLoans.HomeLoan();
                    break;
                case 3:
                    bankLoans.setIntersetrateHomeLoan(9.5);
                    bankLoans.HomeLoan();
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }
    public void personalLoan(){
        System.out.println("Enter loan Amount: ");
        loanAmount= sc.nextLong();
        System.out.println("Enter your Account Number: ");
        long accountnumber= sc.nextLong();
        if(accountnumber==getAccountNumber()){
            System.out.println("-----Enter Time period---");
            BankLoans bankLoans= new BankLoans();
            System.out.println("1. 10 years 2. 15 years 3. 20 years");
            int timepreiod=sc.nextInt();
            switch (timepreiod){
                case 1:
                    bankLoans.setInterestratePersonalLoan(5.3);
                    bankLoans.PersonalLoan();
                    break;
                case 2:
                    bankLoans.setInterestratePersonalLoan(7.6);
                    bankLoans.PersonalLoan();
                    break;
                case 3:
                    bankLoans.setInterestratePersonalLoan(11.2);
                    bankLoans.PersonalLoan();
                default:
                    System.out.println("Invalid");
            }
        }else {
            System.out.println("Invalid account number!");
        }
    }
    public  void educationLoan(){
        System.out.println("Enter Student loan  Amount:  ");
        loanAmount= sc.nextLong();
        System.out.println("Enter Your Account Number: ");
        long accountNumber= sc.nextLong();
        double marksOfSecondayExam;
        double marksOfHighSecondayExam;
        double graduationMarks = 0;
        double marksOfEntrance;
        String collageName;
        long feesOfCollage;
        long estimateExpance;
        long anualIncome;
        String parentname;
        long parentPhoneNumber;
        int parentAge;
        String parentBankName;
        String parentBankBranch;
        long parentAcoountnumberNumber;
        String LastQualification;
        if (accountNumber==getAccountNumber()){
            System.out.println("Enter Anunal income:  ");
            anualIncome= sc.nextLong();
            System.out.println("---Academic details---");
            System.out.print("Enter Last Qualification(in word): ");
            LastQualification=sc.nextLine();
            System.out.println("Enter Secondary Exam Marks: ");
            marksOfSecondayExam=sc.nextDouble();
            System.out.println("Enter Higher Secondary exam marks: ");
            marksOfHighSecondayExam= sc.nextDouble();
            System.out.println("Enter Entrance exam Marks: ");
            marksOfEntrance=sc.nextDouble();
            System.out.println("Do you Complete Graduation?(y/n)");
            String g= sc.nextLine();
            if (g.equals("y")){
                System.out.println("Enter Your Graduation CGPA: ");
                graduationMarks= sc.nextDouble();
            }else {
                System.out.println("Continue Filling");
            }
            System.out.println("--------Collage Details-------");
            System.out.println("Enter Collage Name: ");
            collageName= sc.nextLine();
            System.out.println("Enter Fees of collage: ");
            feesOfCollage= sc.nextLong();
            System.out.println("Enter other Expancess(book,hostel,tuition fee): ");
            estimateExpance= sc.nextLong();
            System.out.println("-----Parent details-----");
            System.out.println("Enter your parent name(father or mother): ");
            parentname= sc.nextLine();
            System.out.println("Parent Age: ");
            parentAge= sc.nextInt();
            System.out.println("Parent Phone Number: ");
            parentPhoneNumber=sc.nextLong();
            System.out.println("------Parent Bank details-----");
            System.out.println("Bank Name: ");
            parentBankName= sc.nextLine();
            System.out.println("Bank Branch: ");
            parentBankBranch= sc.nextLine();
            System.out.println("Bank Account Number; ");
            parentAcoountnumberNumber= sc.nextLong();
            BankLoans bankLoans =new BankLoans(LastQualification,marksOfSecondayExam,marksOfHighSecondayExam,marksOfEntrance,collageName,feesOfCollage,estimateExpance,anualIncome,parentname,parentPhoneNumber,
                    parentAge,parentBankName,parentBankBranch,parentAcoountnumberNumber,graduationMarks);
            System.out.println("-----Time Preiod----");
            System.out.println("1. 10 years 2. 15 years 3. 20 years ");
            int timePreiod= sc.nextInt();
            switch (timePreiod){
                case 1:
                    bankLoans.setInterestrateEducationLoan(4.5);
                    bankLoans.Education();
                    break;
                case 2:
                    bankLoans.setInterestrateEducationLoan(6.7);
                    bankLoans.Education();
                    break;
                case 3:
                    bankLoans.setInterestrateEducationLoan(8.9);
                    bankLoans.Education();
                    break;
                default:
                    System.out.println("Invalid");
            }

        }else {
            System.out.println("Account Number Does Not Match");
        }
    }
    public void businessLoan(){
        System.out.println("Enter Loan Amount: ");
        loanAmount= sc.nextLong();
        System.out.println("Enter Account Number: ");
        long accountNumber= sc.nextLong();
        String gstNumber;
        String shopActNumber;
        long udyamAdhaar;
        if (accountNumber==getAccountNumber()){
            System.out.println("Enter GST Number: ");
            gstNumber= sc.nextLine();
            System.out.println("Enter Shop Act Number: ");
            shopActNumber=sc.nextLine();
            System.out.println("Enter Udyam Aadhaar: ");
            udyamAdhaar= sc.nextLong();
            BankLoans bankLoans=new BankLoans(gstNumber,shopActNumber,udyamAdhaar);
            System.out.println("-----Time Period-------");
            System.out.println("1. 10 years 2. 20 years 3. 30 years ");
            int timeperiod= sc.nextInt();
            switch (timeperiod){
                case 1:
                    bankLoans.setInterestrateBusinessLoan(6.7);
                    bankLoans.Business();
                    break;
                case 2:
                    bankLoans.setInterestrateBusinessLoan(8.1);
                    bankLoans.Business();
                    break;
                case 3:
                    bankLoans.setInterestrateBusinessLoan(9.2);
                    bankLoans.Business();
                    break;
                default:
                    System.out.println("Invalid ");


            }
        }
    }
//    public void loan(long accountNumber ){
//        System.out.println("Enter your AccountNumber: ");
//    }
}
