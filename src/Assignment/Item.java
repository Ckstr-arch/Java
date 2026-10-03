package Assignment;

public class Item {
    String itemName; 
    double price;
    int quantity;

    public void setItem(String name, double fee, int qnt){
        itemName = name;
        price = fee;
        quantity = qnt;
    }

    public double getSubtotal(){
        return price * quantity;
    }
}
