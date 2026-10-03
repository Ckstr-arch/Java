package Assignment;

public class Rectangle {
    double length;
    double width;

    // Area formula
    public double calculateArea() {
        return length * width;
    }
    
    // Perimeter formula
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    //Check whether width == length
    public boolean isSquare(){
        if (width == length){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 5.0;
        rectangle1.width = 5.0;

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 4.0;
        rectangle2.width = 6.0;

        System.out.println("\nRectangle 1, Area: " + rectangle1.calculateArea());
        System.out.println("Rectangle 1, Perimeter: " + rectangle1.calculatePerimeter());
        System.out.println("Rectangle 1, isSquare result: " + rectangle1.isSquare());

        System.out.println("\nRectangle 2, Area: " + rectangle2.calculateArea());
        System.out.println("Rectangle 2, Perimeter: " + rectangle2.calculatePerimeter());    
        System.out.println("Rectangle 2, isSquare result: " + rectangle2.isSquare());
    }
}
