public class Loops {
    //String str = " Hello, World!";
    //String Str = "Hello World!";
    public static void main(String args[]){
        /*
        Loops string = new Loops();
        // Print the length of the string
        System.out.println(string.str.length());
        // Print the string in uppercase
        System.out.println(string.str.toUpperCase());
        // Print the string in lowercase
        System.out.println(string.str.toLowerCase());
        // Print the index of the first occurence of a specified text in a string
        System.out.println(string.str.indexOf("llo"));
        // Use to access a character at a specific position in a string:
        System.out.println(string.str.charAt(4));   
        //Remove white space befor and after the string
        System.out.println(string.str.trim());
        //Compare two strings
        System.out.println(string.str.equals(string.Str));
        //Concatenate two strings
        System.out.println(string.str.concat(string.Str));*/

        /* 
        // Print Max number
        System.out.println(Math.max(10, 5));
        // Print Min number
        System.out.println(Math.min(10, 15));
        //Square root
        System.out.println(Math.sqrt(64));
        // Absolute value
        System.out.println(Math.abs(-4.7));
        //Power
        System.out.println(Math.pow(2, 3));
        //Random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random());
        System.out.println(Math.random()*101); //Between 1 and 100
        //Rounding Methods
        System.out.println(Math.round(10.67)); //Round normally
        System.out.println(Math.ceil(10.67));//rounds up (returns the smallest integer greater than or equal to x)
        System.out.println(Math.floor(10.67));//rounds down (returns the largest integer less than or equal to x)*/

        //variable = (condition) ? expressionTrue :  expressionFalse;
        int day = 4;
        switch (day) {
            case 6:
                 System.out.println("Today is Saturday");
                 break;
            case 7:
                 System.out.println("Today is Sunday");
                 break;
            default:
                 System.out.println("Looking forward to the Weekend");
        }   
    }
}
