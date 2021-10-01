import java.util.ArrayList;
public class BankAccountTest {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(0,0);
        acc1.addMoneyChecking(10);
        acc1.addMoneySavings(20);
        acc1.addMoneyChecking(10.60);
        System.out.println(acc1);
        System.out.printf("Account number: %d \n",acc1.getAccNumber());
        System.out.printf("Your checking account balance is: $ %f \n",acc1.getChecking());
        System.out.printf("Your savings account balance is: $ %f \n",acc1.getSavings());
        System.out.printf("Total in checking and savings account is: $ %f \n",acc1.totalInAccounts());
        System.out.println(BankAccount.numOfAcc);

        BankAccount acc2 = new BankAccount(40,0);
        System.out.println(acc2);
        System.out.printf("Account number: %d \n",acc2.getAccNumber());
        acc2.addMoneySavings(30);
        acc2.withdrawChecking(200);
        System.out.printf("Your checking account balance is: $ %f \n",acc2.getChecking());
        System.out.printf("Your savings account balance is: $ %f \n",acc2.getSavings());
        System.out.printf("Total in checking and savings account is: $ %f \n",acc2.totalInAccounts());
        System.out.println(BankAccount.numOfAcc);
    }
}