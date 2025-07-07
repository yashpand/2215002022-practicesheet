package Keyword;

public class BankAccount {

    static String bankName = "AB Bank";
    static  int totalAccounts= 0;

    private final int accountNumber;
    private String accountHolderName;
    private  double balance;

    public BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName= accountHolderName;
        this.balance= balance;
        totalAccounts++;
    }

    public static int  getTotalAccounts(){
        return  totalAccounts;
    }

    public  void  displayDetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {


        BankAccount acc1 = new BankAccount(3001,"sneha",3000);
        BankAccount acc2 = new BankAccount(3004,"neha",10000);

        if(acc1 instanceof BankAccount){
            acc1.displayDetails();
        }

        if(acc2 instanceof BankAccount){
            acc2.displayDetails();
        }

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());

    }


}
