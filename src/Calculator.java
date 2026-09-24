class Calculator {
    // Variable Declarations
    int num1 = 20;
    int num2 = 10;

    // Main Method: Entry point required for execution
    public static void main(String[] args) {
        // Instantiate the object
        Calculator pink = new Calculator();
        
        // Execute the addition method
        pink.addNumbers();
        pink.subNumbers(10,15);
        pink.subNumbers(1000, 50);
    }
    
    // Method 01: non-taken, non-returned 
    void addNumbers() {
        int tot = num1 + num2;
        System.out.println("Add: " + tot);
    }
    
    //Method 2 : parameterized . Still Non - return; void method
    void subNumbers(int a, int b){
        int sub = a - b;
        System.out.println("Sub: "+ sub);
    }
    
    //Method 3
}