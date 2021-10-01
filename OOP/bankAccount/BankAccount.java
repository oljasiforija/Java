import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class BankAccount{
    private double checking;
    private double savings;
    private int accNumber;
    public static int numOfAcc = 0;
    
    //constructor
    public BankAccount(double checking, double savings){
        this.checking = checking;
        this.savings = savings;
        this.accNumber = randomNumber();
        numOfAcc++;
    }

    //methods
    public void addMoneyChecking(double money){
        this.checking += money;
    }
    public void addMoneySavings(double money){
        this.savings += money;
    }
    public void withdrawChecking(double money){
        if(this.checking <= money){
            System.out.println("You are broke!");
        }
        else{
            this.checking -= money;
        }
    }
    public double totalInAccounts(){
        double sum = this.checking + this.savings;
        return sum;
    }
    private int randomNumber(){
        Random random = new Random();
        return random.nextInt(1000000);
    }



    //getters and setters
    public double getChecking(){
        return this.checking;
    }
    public void setChecking(){
        this.checking = checking;
    }
    public double getSavings(){
        return this.savings;
    }
    public void setSavings(){
        this.savings = savings;
    }
    public int getAccNumber(){
        return this.accNumber;
    }
    public void setAccNumber(){
        this.accNumber = accNumber;
    }
}