class Laptops {
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        Laptops L1 = new Laptops();
        L1.brand = "Apple";
        L1.model = "MacBook Pro";
        L1.price = 1999.99;

        Laptops L2 = new Laptops();
        L2.brand = "Dell";
        L2.model = "XPS 13";
        L2.price = 1499.99;

        System.out.println("\nLaptop 1: " + "Brand: " + L1.brand + " " +"Model: " + L1.model+"Price: " + L1.price);
        System.out.println("Laptop 2: " + "Brand: " + L2.brand + " " + "Model: " + L2.model +"Price: " + L2.price);
    }
}
