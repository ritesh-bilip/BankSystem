package Bank;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class HomeLoan implements Loan{
     private String granterName;
     private int granterAge;
     private long adharNumber;
     private long phoneNumber;
     private String bankName;
     private String granterAccounNumber;
     private double intersetrateHomeLoan;
     private double interestratePersonalLoan;
     private double interestrateEducationLoan;
     private double interestrateBusinessLoan;
     private double interestrateGoldLoan;
     private double interestrateCreditcardLoan;

    public HomeLoan(String granterName, int granterAge, long adharNumber, long phoneNumber, String bankName, String ifcCode, String granterAccounNumber){
        this.granterName=granterName;
        this.granterAge=granterAge;
        this.adharNumber=adharNumber;
        this.granterAccounNumber=granterAccounNumber;
        this.phoneNumber=phoneNumber;
        this.bankName=bankName;
    }

    public String getGranterName() {
        return granterName;
    }

    public void setGranterName(String granterName) {
        this.granterName = granterName;
    }

    public int getGranterAge() {
        return granterAge;
    }

    public void setGranterAge(int granterAge) {
        this.granterAge = granterAge;
    }

    public long getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(long adharNumber) {
        this.adharNumber = adharNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getGranterAccounNumber() {
        return granterAccounNumber;
    }

    public void setGranterAccounNumber(String granterAccounNumber) {
        this.granterAccounNumber = granterAccounNumber;
    }

    public HomeLoan(){

    }
    public double getIntersetrateHomeLoan() {
        return intersetrateHomeLoan;
    }

    public void setIntersetrateHomeLoan(double intersetrateHomeLoan) {
        this.intersetrateHomeLoan = intersetrateHomeLoan;
    }

    public double getInterestratePersonalLoan() {
        return interestratePersonalLoan;
    }

    public void setInterestratePersonalLoan(double interestratePersonalLoan) {
        this.interestratePersonalLoan = interestratePersonalLoan;
    }

    public double getInterestrateEducationLoan() {
        return interestrateEducationLoan;
    }

    public void setInterestrateEducationLoan(double interestrateEducationLoan) {
        this.interestrateEducationLoan = interestrateEducationLoan;
    }

    public double getInterestrateBusinessLoan() {
        return interestrateBusinessLoan;
    }

    public void setInterestrateBusinessLoan(double interestrateBusinessLoan) {
        this.interestrateBusinessLoan = interestrateBusinessLoan;
    }


}
