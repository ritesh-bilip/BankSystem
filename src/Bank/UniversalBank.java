package Bank;

import java.util.Scanner;

public class UniversalBank {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------Welcome TO Universal Banks----");
        System.out.println("Do you Have any Bank Account?(y/n)");
        String choice=sc.nextLine();
        if (choice.equals("y")){
            System.out.println("------Banks For Account Opening----");
            System.out.println("1.Bank Of India\n2. State Bank\n3. Axis Bank");
            int bankChoice= sc.nextInt();
            BankOfIndia bankOfIndia=new BankOfIndia();
            StateBank  stateBank=new StateBank();
            AxisBank axisBank=new AxisBank();
            String serviceChoice;
            switch (bankChoice){
                case 1:
                    bankOfIndia.accountCreate();
                    do{
                        System.out.println("1.Account Functionality\n2.Bank Of India Services");
                        int bankOfIndiaChoice= sc.nextInt();
                        if (bankOfIndiaChoice == 1) {
                            bankOfIndia.accountFuntionality();
                        } else if (bankOfIndiaChoice==2) {
                            bankOfIndia.bankServices();
                        }else {
                            System.out.println("Invalid input");
                        }
                        System.out.println("DO you want to continue with services ?(y/n)");
                        serviceChoice=sc.nextLine();
                    }while (serviceChoice.equals("y"));
                    break;
                case 2:
                    stateBank.accountCreate();
                    do{
                        System.out.println("1.Account Functionality\n2.Bank Of India Services");
                        int bankOfChoice= sc.nextInt();
                        if (bankOfChoice == 1) {
                            stateBank.accountFuntionality();
                        } else if (bankOfChoice==2) {
                            stateBank.bankServices();
                        }else {
                            System.out.println("Invalid input");
                        }
                        System.out.println("DO you want to continue with services ?(y/n)");
                        serviceChoice=sc.nextLine();
                    }while (serviceChoice.equals("y"));
                    break;
                case 3:
                    axisBank.accountCreate();
                    do{
                        System.out.println("1.Account Functionality\n2.Bank Of India Services");
                        int bankOfChoice= sc.nextInt();
                        if (bankOfChoice == 1) {
                            axisBank.accountFuntionality();
                        } else if (bankOfChoice==2) {
                            axisBank.bankServices();
                        }else {
                            System.out.println("Invalid input");
                        }
                        System.out.println("DO you want to continue with services ?(y/n)");
                        serviceChoice=sc.nextLine();
                    }while (serviceChoice.equals("y"));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }else {
            System.out.println("Invalid input");
        }


    }
}
