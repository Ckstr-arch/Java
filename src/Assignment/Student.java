package Assignment;

public class Student {
   String studentName;
   double mathMarks;
   double scienceMarks;
   double englishMarks;

   //Details
   public void setDetails(String name, double math, double science, double english) {
       studentName = name;
       mathMarks = math;
       scienceMarks = science;
       englishMarks = english;
   }
   //Total
   public int getTotal(){
       return (int)(mathMarks + scienceMarks + englishMarks);
   }

    //Average
   public double getAverage(){
         return getTotal() / 3;
   }

   //Grade
   public String getGrade(){
       double average = getAverage();
       if (average >= 75){
           return "A";
       }
       else if (average >= 65){
           return "B";
       }
       else if (average >= 50){
           return "C";
       }
       else{
           return "F";
       }
   }

   public static void main(String[] args) {

       //Std 1
       Student student1 = new Student();
       student1.setDetails("John Doe", 85, 78, 92);

       System.out.println("\nStudent Name: " + student1.studentName);
       System.out.println("Total Marks: " + student1.getTotal());
       System.out.println("Average Marks: " + student1.getAverage());
       System.out.println("Grade: " + student1.getGrade());

        //Std 2
        Student student2 = new Student();  
        student2.setDetails("Jane Smith", 68, 74, 81);

        System.out.println("\nStudent Name: " + student2.studentName);
        System.out.println("Total Marks: " + student2.getTotal());
        System.out.println("Average Marks: " + student2.getAverage());
        System.out.println("Grade: " + student2.getGrade());    

        //Std 3
        Student student3 = new Student();
        student3.setDetails("Alice Johnson", 45, 52, 60);   

        System.out.println("\nStudent Name: " + student3.studentName);
        System.out.println("Total Marks: " + student3.getTotal());
        System.out.println("Average Marks: " + student3.getAverage());  
        System.out.println("Grade: " + student3.getGrade());
   }
}
