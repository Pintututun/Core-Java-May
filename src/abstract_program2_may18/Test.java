package abstract_program2_may18;
import java.util.Scanner;
public class Test extends ATM 
{
	@Override
    public void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Test testATM = new Test();
        testATM.display();
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the password--");
        int enteredPassword = sc.nextInt();
        System.out.println("Enter 1:Withdraw");
        System.out.println("Enter 2:Tranfer");
        System.out.print("Enter your option-");
        int option=sc.nextInt();
        switch(option)
        {
        case 1:System.out.print("Enter the withdrawal amount--");
        int withdrawalAmount = sc.nextInt();
        	if(testATM.withdrawal_cash(enteredPassword, withdrawalAmount)) {
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Withdrawal Failed!");
        }
        testATM.display();
        break;

        case 2:System.out.print("Enter the transfer amount--");
        int transferAmount = sc.nextInt();
        	if (testATM.money_transfer(enteredPassword, transferAmount)) {
            System.out.println("Money Transfer Successful!");
        } else {
            System.out.println("Money Transfer Failed!");
        }
        testATM.display();
        
    }

}
}
