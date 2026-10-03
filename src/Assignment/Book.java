package Assignment;

public class Book {
    String author;
    String title;
    int pages;

    public void displayDetails(){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Dan Brown";
        book1.title = "Inferno";
        book1.pages = 480;


        System.out.println("\nBook 1 Details:");
        book1.displayDetails();

    }
}
