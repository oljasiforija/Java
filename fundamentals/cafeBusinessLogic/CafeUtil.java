import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CafeUtil {

    public int getStreakGoal(int numOfWeeks){
        int numOfDrinks = 0;
        while(numOfWeeks > 0){
            numOfDrinks += numOfWeeks;
            -- numOfWeeks;
        }
        return numOfDrinks;
    }
    public void printPriceChart(String productName, double price, int maxNumber){
        System.out.println(productName);
        for(int i=1; i <= maxNumber; i++){
            System.out.println(String.format(" %o $ %f ", i, i*price));
        }
    }
    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(int i=0; i < lineItems.length; i++){
            sum += lineItems[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menu,ArrayList<Double> prices){
        for(int i=0; i < menu.size(); i++){
        System.out.println(String.format("%s - %f",menu.get(i),prices.get(i)));
    }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.printf("Hello %s, there are %o people ahead of you.",userName,customers.size());
    }
}