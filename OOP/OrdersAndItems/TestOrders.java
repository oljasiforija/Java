import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args){
        Order order1 = new Order("Olja");
        Item item2 = new Item("Latte",4.00);
        Item item1 = new Item("Drip Coffee",2.50);
        order1.addItem(item2);
        order1.addItem(item1);
        order1.totalOrder();
        System.out.printf("Name: %s \n",order1.getName());
        order1.displayMenu();
        System.out.printf("Total: $ %f \n",order1.getTotal());
        order1.updateOrderStatus();
        

        Order order2 = new Order();
        Item item3 = new Item("Mocha",4.00);
        order2.addItem(item3);
        order2.totalOrder();
        System.out.printf("Name: %s \n",order2.getName());
        order2.displayMenu();
        System.out.printf("Total: $ %f \n",order2.getTotal());
        order2.updateOrderStatus();

    }
}