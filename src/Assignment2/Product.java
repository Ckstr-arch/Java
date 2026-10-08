package Assignment2;

public class Product {
    String productId;
    String productName;
    double unitPrice;

    public Product(){
        productId = "P001";
        productName = "Default Product";
        unitPrice = 0.0;
    }

    public Product(String id, String name, double price){
        productId = id;
        productName = name;
        unitPrice = price;
    }
    public void applyDiscount(double percentage){
        unitPrice *= (1 - percentage / 100);
        System.out.println("Updated unit price: " + unitPrice);
    }
    public String getProductLable(){
        return productId + " - " + productName + " - Rs." + unitPrice;
    }

    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product("P002", "Laptop", 50000.0);
        
        System.out.println();
        System.out.println(p1.getProductLable());
        System.out.println(p2.getProductLable());
        p2.applyDiscount(15);
        System.out.println(p2.getProductLable());
    }
}
