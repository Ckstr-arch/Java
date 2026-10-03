package Assignment;

public class ShoppingCart {

    Item[] items = new Item[5];
    int itemCount;
    
    public boolean addItem(Item item){
        if (itemCount >= 0 && itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
            return true;
        }
        else{
            System.out.println("Cart is full.");
            return false;
        }
    }

    public double calculateTotal(){
        double sum = 0;
        for (int i = 0; i < itemCount; i++) {
            sum += items[i].getSubtotal();
        }
        return sum;
    }

    
    public Item findMostExpensive() {

        if (itemCount == 0) {
            return null;
        }

        Item expensiveItem = items[0];

        for (int i = 1; i < itemCount; i++) {

            if (items[i].getSubtotal() > expensiveItem.getSubtotal()) {
                expensiveItem = items[i];
            }
        }

        return expensiveItem;
    }

    public double applyCoupon(String code) {

        double total = calculateTotal();
        total = Math.round(total*100.0)/100.0;

        if (code.equals("SAVE10")) { //use .equals for non primitive data types
            total = total*0.90;
            total = Math.round(total*100.0)/100.0;
            return total;
        }
        else if (code.equals("SAVE25") && total > 5000) {
            total = total*0.75;
            total = Math.round(total*100.0)/100.0;
            return total;
        }
        else {
            return total;
        }
    } 

    public void printReceipt(){
        for (int i = 0; i < itemCount; i++){
            System.out.println("\nItem's name: " + items[i].itemName);
            System.out.println("Quantity: " + items[i].quantity);
            System.out.println("Subtotal: Rs." + items[i].getSubtotal());
        }
        double calculatedTotal = calculateTotal();
        calculatedTotal = Math.round(calculatedTotal * 100.0) / 100.0;
        System.out.println("\nTotal: Rs."+ calculatedTotal);
    }

    public static void main(String[] args){

        //Item1
        Item item1 = new Item();
        item1.setItem("Eggs", 24.50, 12);

        //Item2
        Item item2 = new Item();
        item2.setItem("Rice", 350.00, 2);

        //Item3
        Item item3 = new Item();
        item3.setItem("Milk", 249.99, 5);

        //Item4
        Item item4 = new Item();
        item4.setItem("Steaks", 1459.67, 1);
        
        //Item5
        Item item5 = new Item();
        item5.setItem("Ice Cream", 456.09, 3);

        //Item6
        Item item6 = new Item();
        item6.setItem("Cooking Oil", 750, 9);

        //ShoppingCart1
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);

        System.out.println("\n6th Item:");
        cart.addItem(item6);

        cart.printReceipt();

        System.out.println("\nMost Expensive Item: " + cart.findMostExpensive().itemName);
        
        System.out.println("\nAfter 10% off: " + cart.applyCoupon("SAVE10"));
        System.out.println("\nAfter 25% off: " +cart.applyCoupon("SAVE25"));


    }

}
