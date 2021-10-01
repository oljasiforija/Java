    import java.util.ArrayList;
    public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order(){
        this.name = "Guest";

    }
    public Order(String name){
        this.name = name;
    }


    public void displayMenu(){
        for(Item item : this.items){
            System.out.println(String.format("%s",item.getName()));
        }
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void totalOrder(){
        for(Item item : this.items){
            this.total += item.getPrice();
        }
    }
    public void updateOrderStatus(){
        if(!this.ready){
            System.out.println("Your order is ready.");
        }
        else{
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getTotal(){
        return this.total;
    }
    public void setTotal(){
        this.total = total;
    }

    public boolean getReady(){
        return this.ready;
    }
    public void setReady(){
        this.ready = ready;
    }
}