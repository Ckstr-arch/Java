public class FoodOrder {
     String customerName  = "Sam";
     String[] foodItem = {"Pancake", "Omellet", "sunny side up eggs with sausage","waffle"};
     double unitPrice = 75.50;
     double subTotal;
     int  quantity;

    public static void main(String[] args) {
        FoodOrder current = new FoodOrder();
        System.out.println("Customer Name: "+ current.customerName);
        current.displayOrder();
        current.updateQuantity(10);
        current.subTotal = current.calculateSubtotal();
        System.out.println("Final Bill: "+current.calculateFinalTotal(5.2));     
    }


   void displayOrder(){
    System.out.println(foodItem[0]);
    
   }
   void updateQuantity(int newQuantity){
      quantity =  newQuantity;
      //System.out.println(quantity);

   }
   double calculateSubtotal(){
      double subTotal = quantity * unitPrice;
      //System.out.println(subTotal);
      return subTotal;
         
   }
   double calculateFinalTotal(double discountPercentage){
      //System.out.println(discountPercentage);
      System.out.println(subTotal);
      double finalBill = (1.0-(discountPercentage/100))*subTotal;
      return finalBill;
   }
}
