public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";
        String newTotalMessage = "Your new total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.2;
        double lattePrice = 4.5;
        double cappuccinoPrice = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        if(isReadyOrder1) {
            System.out.println(customer1 + readyMessage + displayTotalMessage + dripCoffeePrice);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }

        boolean isReadyOrder2 = false;
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage + displayTotalMessage + 2*lattePrice);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        boolean isReadyOrder3 = true;
        if(isReadyOrder3) {
            System.out.println(customer3 + readyMessage + newTotalMessage + (lattePrice-dripCoffeePrice));
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }

        boolean isReadyOrder4 = true;
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappuccinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// // ** Your customer interaction print statements will go here ** //
        // System.out.println(customer1 + pendingMessage);
    }
}