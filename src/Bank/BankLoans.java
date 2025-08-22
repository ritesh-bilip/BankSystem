package Bank;

public class BankLoans extends HomeLoan implements Loan{

    AccountFunctionality accountFunctionality=new AccountFunctionality();
    BankFunctionality bankFunctionality=new BankFunctionality();

    private double marksOfSecondayExam;
    private double marksOfHighSecondayExam;
    private double graduationMarks;
    private double marksOfEntrance;
    private String collageName;
    private long feesOfCollage;
    private  long estimateExpance;
    private long anualIncome;
    private String parentname;
    private long parentPhoneNumber;
    private int parentAge;
    private String parentBankName;
    private String parentBankBranch;
    private long parentAcoountnumberNumber;
    private String LastQualification;
    public BankLoans(String granterName, int granterAge, long adharNumber, long phoneNumber, String bankName, String ifcCode, String granterAccounNumber) {
        super(granterName, granterAge, adharNumber, phoneNumber, bankName, ifcCode, granterAccounNumber);
    }
    public BankLoans(double marksOfSecondayExam,double marksOfHighSecondayExam,double marksOfEntrance,String collageName,long feesOfCollage,long estimateExpance,long anualIncome,
                     String parentname,long parentPhoneNumber,int parentAge,String parentBankName,String parentBankBranch,long parentAcoountnumberNumber,String lastQualification){
        this.marksOfSecondayExam=marksOfSecondayExam;
        this.marksOfHighSecondayExam=marksOfHighSecondayExam;
        this.marksOfEntrance=marksOfEntrance;
        this.feesOfCollage=feesOfCollage;
        this.estimateExpance=estimateExpance;
        this.anualIncome=anualIncome;
        this.parentname=parentname;
        this.parentAge=parentAge;
        this.parentBankName=parentBankName;
        this.parentBankBranch=parentBankBranch;
        this.parentAcoountnumberNumber=parentAcoountnumberNumber;
        this.parentPhoneNumber=parentPhoneNumber;
        this.LastQualification=lastQualification;
        this.collageName=collageName;
    }

    public BankLoans(double marksOfSecondayExam,double marksOfHighSecondayExam,double marksOfEntrance,String collageName,long feesOfCollage,long estimateExpance,long anualIncome,
                     String parentname,long parentPhoneNumber,int parentAge,String parentBankName,String parentBankBranch,long parentAcoountnumberNumber,double graduationMarks){
        this.marksOfSecondayExam=marksOfSecondayExam;
        this.marksOfHighSecondayExam=marksOfHighSecondayExam;
        this.marksOfEntrance=marksOfEntrance;
        this.feesOfCollage=feesOfCollage;
        this.estimateExpance=estimateExpance;
        this.anualIncome=anualIncome;
        this.parentname=parentname;
        this.parentAge=parentAge;
        this.parentBankName=parentBankName;
        this.parentBankBranch=parentBankBranch;
        this.parentAcoountnumberNumber=parentAcoountnumberNumber;
        this.parentPhoneNumber=parentPhoneNumber;
        this.graduationMarks=graduationMarks;
        this.collageName=collageName;
    }

    public   void ApplicantDetails(){
        System.out.println("------------Applicant Personal details-------------");
        System.out.println("Applicant name: "+accountFunctionality.getAccountHolderName());
        System.out.println("Applicant Age: "+accountFunctionality.getAge());
        System.out.println("Applicant AdharNumber : "+accountFunctionality.getAdharNumber());
        System.out.println("Applicant PhoneNumber: "+accountFunctionality.getPhonenumber());
        System.out.println("Applicant AccountNumber: "+accountFunctionality.getAccountNumber());
        System.out.println("Annual income:  "+anualIncome);
    }
    @Override
    public void HomeLoan() {
        System.out.println("_____________loan Details_______________");
        ApplicantDetails();
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
        ApplicantDetails();
        System.out.println("-----------loan Contract---------");
        System.out.println("Personal Loan Amount: "+bankFunctionality.getLoanAmount());
        System.out.println("Personal Loan Interest rate: "+getInterestratePersonalLoan());
        double interest=(bankFunctionality.getLoanAmount()*getInterestratePersonalLoan()/100);
        System.out.println("Personal Loan Interest: "+interest);
        System.out.println("Total Money to Pay"+(bankFunctionality.getLoanAmount()+interest));
    }

    @Override
    public void Education() {
        ApplicantDetails();
        System.out.println("----------Applicant Academics----------");
        System.out.println("Applicant last Qualification: "+LastQualification);
        System.out.println("Applicant Secondary Marks: "+marksOfSecondayExam);
        System.out.println("Applicant Higher Secondary marks: "+ marksOfHighSecondayExam);
        System.out.println("Applicant Graduation CGPA: "+graduationMarks);
        System.out.println("Applicant Entrance Marks: "+marksOfEntrance);
        System.out.println("----------Collage Details-------");
        System.out.println("Collage Name: "+collageName);
        System.out.println("Collage fees: "+feesOfCollage);
        System.out.println("Other Expancess: "+estimateExpance);
        System.out.println("----------Parent Details----------------");
        System.out.println("Parent (Father Or Mother) Name: "+parentname);
        System.out.println("Parent Age: "+parentAge);
        System.out.println("Parent Phone number: "+parentPhoneNumber);
        System.out.println("_____________loan Details_______________");
        System.out.println("-------------Applicant Bank Details-------");
        System.out.println("Applicant Name: "+accountFunctionality.getAccountHolderName());
        System.out.println("Applicant AccountNumber: "+accountFunctionality.getAccountNumber());
    }

    @Override
    public void Business() {
        ApplicantDetails();


    }

    @Override
    public void GoldLoan() {

    }

    @Override
    public void CreditCardLoan() {

    }
}
