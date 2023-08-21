import java.util.Scanner;

class ATMMachine{
    int Balance;
    int PIN=5674;
    public void checkpin(){
        System.out.println("enter your PIN");
        Scanner sc=new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if(enteredpin==PIN) {
            menu();
        }
        else{
            System.out.println("Enter a valid Pin");
           return;
     }
    }
    public void menu(){
    System.out.println("Enter Your Choice");
    System.out.println("1. Check A/c Balance ");
    System.out.println("2. Balance Withdraw");
    System.out.println("3. Deposite Balance");
    System.out.println("4. EXIT");

    Scanner sc =new Scanner(System.in);
    int opt= sc.nextInt();
    if (opt==1){
        checkBalance();
    }
   else if(opt==2){
        BalanceWithdraw();
    }
   else if(opt==3){
        DepositeBalance();
    }
   else if(opt==4){
        return;
    }
   else{
        System.out.println("Enter a valid Choice");
    }
    }
	public void checkBalance(){
        System.out.println("Balance:"+Balance);
        menu();
    }
    public void BalanceWithdraw(){
        System.out.println("Enten a amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdraw Successsfully");
        }
        menu();
    }
    public void DepositeBalance(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        int Amount= sc.nextInt();
        Balance=Balance + Amount;
        System.out.println("Money Deposited successfully");
        menu();
    }
	}
	public class ATM {
    public static void main(String []args){
    	ATMMachine obj = new ATMMachine();
        obj.checkpin();
    }
}