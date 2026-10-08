package Assignment2;

public class Student {
    String studentId;
    String name;
    int age;
    double gpa;

    public static void main(String[] args){
        Student s1 = new Student("S001", "Alice", 20, 3.5);
        System.out.println();
        s1.introduce();
        s1.updateGPA(3.8);

        Student s2 = new Student("S002", "Bob", 22, 3.2);
        System.out.println();
        s2.introduce();
        s2.updateGPA(3.6);
    }

    public  Student(String Id, String studentName, int Age, double GPA){
        studentId = Id;
        name = studentName;
        age = Age;
        gpa = GPA;
    }

    public void  introduce(){
        System.out.println("Welcome, " + name+ "!. Your student ID is " + studentId + " and you are " + age + " years old. Your GPA is " + gpa);
    }

    public void updateGPA(double newGPA){
        gpa = newGPA;
        System.out.println("Your GPA has been updated to " + gpa);
    }
}
