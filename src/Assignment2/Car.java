package Assignment2;

public class Car {
    String year, brand;
    double price;

    public static void main(String[] args){
        Car car1 = new Car();

        car1.displayInfo();
       
    }

    public Car(){
        this.year = "2000";
        this.brand = "Unknown";
        this.price = 0.0;
    }

    public void displayInfo(){
        System.out.println("Car Year: " + year);
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Price: " + price);
    }
}
