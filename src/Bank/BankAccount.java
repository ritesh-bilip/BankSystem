package Bank;

public abstract class BankAccount {
    private String accountHolderName;
    private int Age;
    private long AdharNumber;
    private long Phonenumber;
    private int minimumDeposite;
    private String AccountNumber;

    public BankAccount(String accountHolderName, int age, long adharNumber, long phonenumber, int minimumDeposite,String AccountNumber) {
        this.accountHolderName = accountHolderName;
        this.Age = age;
        this.AdharNumber = adharNumber;
        this.Phonenumber = phonenumber;
        this.minimumDeposite = minimumDeposite;
        this.AccountNumber=AccountNumber;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }
    protected BankAccount() {
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAge() {
        return Age;
    }
    public long getAdharNumber() {
        return AdharNumber;
    }
    public long getPhonenumber() {
        return Phonenumber;
    }
    public int getMinimumDeposite() {
        return minimumDeposite;
    }
}
