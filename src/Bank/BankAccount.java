package Bank;

public abstract class BankAccount {
    private String accountHolderName;
    private int Age;
    private long AdharNumber;
    private long Phonenumber;
    private int minimumDeposite;
    private long AccountNumber;

    public BankAccount(String accountHolderName, int age, long adharNumber, long phonenumber, int minimumDeposite,long AccountNumber) {
        this.accountHolderName = accountHolderName;
        this.Age = age;
        this.AdharNumber = adharNumber;
        this.Phonenumber = phonenumber;
        this.minimumDeposite = minimumDeposite;
        this.AccountNumber=AccountNumber;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, int age, long adharNumber, long phonenumber) {
        this.accountHolderName = accountHolderName;
        this.accountHolderName = accountHolderName;
        this.Age = age;
        this.AdharNumber = adharNumber;
        this.Phonenumber = phonenumber;
    }

    protected BankAccount() {
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public long getAdharNumber() {
        return AdharNumber;
    }

    public void setAdharNumber(long adharNumber) {
        AdharNumber = adharNumber;
    }

    public long getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        Phonenumber = phonenumber;
    }

    public int getMinimumDeposite() {
        return minimumDeposite;
    }

    public void setMinimumDeposite(int minimumDeposite) {
        this.minimumDeposite = minimumDeposite;
    }
}
