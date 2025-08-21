package Bank;

public class BankLoans extends HomeLoan implements Loan{

    AccountFunctionality accountFunctionality=new AccountFunctionality();
    BankFunctionality bankFunctionality=new BankFunctionality();

    public BankLoans(String granterName, int granterAge, long adharNumber, long phoneNumber, String bankName, String ifcCode, String granterAccounNumber) {
        super(granterName, granterAge, adharNumber, phoneNumber, bankName, ifcCode, granterAccounNumber);
    }

    @Override
    public void HomeLoan() {
        System.out.println("_____________loan Details_______________");
        System.out.println("-------------Applicaent Bank  Details-------");
        System.out.println("Applicaent Name: "+accountFunctionality.getAccountHolderName());
        System.out.println("Applicaent Age: "+accountFunctionality.getAge());
        System.out.println("Applicaent AdharNumber : "+accountFunctionality.getAdharNumber());
        System.out.println("Applicaent PhoneNumber: "+accountFunctionality.getPhonenumber());
        System.out.println("Applicaent AccountNumber: "+accountFunctionality.getAccountNumber());
        System.out.println("------------Garenter Bank Details----------");
        System.out.println("Garenter Name: "+getGranterName());
        System.out.println("Garenter Age: "+getGranterAge());
        System.out.println("Garenter PhoneNumber: "+getPhoneNumber());
        System.out.println("Garenter AdharCard: "+getAdharNumber());
        System.out.println("Garenter Bank AccountNumber: "+getGranterAccounNumber());
        System.out.println("---------Loan Contract--------");
        System.out.println("LoanAmount: "+bankFunctionality.getLoanAmount());
        System.out.println("Home Loan Interest rate: "+getIntersetrateHomeLoan());
        double interset=(bankFunctionality.getLoanAmount()*getIntersetrateHomeLoan()/100);
        System.out.println("Home Loan Interest: "+interset);
        System.out.println("Total Money to pay: "+(bankFunctionality.getLoanAmount()+interset));
    }

    @Override
    public void PersonalLoan(){
        System.out.println("_____________loan Details_______________");
        System.out.println("-------------Applicaent Bank Details-------");
        System.out.println("Applicaent Name: "+accountFunctionality.getAccountHolderName());
        System.out.println("Applicaent Age: "+accountFunctionality.getAge());
        System.out.println("Applicaent AdharNumber : "+accountFunctionality.getAdharNumber());
        System.out.println("Applicaent PhoneNumber: "+accountFunctionality.getPhonenumber());
        System.out.println("Applicaent AccountNumber: "+accountFunctionality.getAccountNumber());
        System.out.println("-----------loan Contract---------");
        System.out.println("Personal Loan Amount: "+bankFunctionality.getLoanAmount());
        System.out.println("Personal Loan Interest rate: "+getInterestratePersonalLoan());
        double interest=(bankFunctionality.getLoanAmount()*getInterestratePersonalLoan()/100);
        System.out.println("Personal Loan Interest: "+interest);
        System.out.println("Total Money to Pay"+(bankFunctionality.getLoanAmount()+interest));
    }

    @Override
    public void Education() {
        AccountFunctionality accountFunctionality=new AccountFunctionality();
        System.out.println("_____________loan Details_______________");
        System.out.println("-------------Applicaent Bank Details-------");
        System.out.println("Applicaent Name: "+accountFunctionality.getAccountHolderName());
        System.out.println("Applicaent Age: "+accountFunctionality.getAge());
        System.out.println("Applicaent AdharNumber : "+accountFunctionality.getAdharNumber());
        System.out.println("Applicaent PhoneNumber: "+accountFunctionality.getPhonenumber());
        System.out.println("Applicaent AccountNumber: "+accountFunctionality.getAccountNumber());
    }

    @Override
    public void Business() {

    }

    @Override
    public void GoldLoan() {

    }

    @Override
    public void CreditCardLoan() {

    }
}
