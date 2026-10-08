package Assignment2;

public class Employee {
    String empId, empName, department;
    double basicSalary;

    public Employee(String empId, String empName, String department, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.basicSalary = basicSalary;
    }
    
    double calculateNetSalary(double bonusPercentage){
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }
    String getEmployeeSummary(){
        return "Employee ID: " + empId + ", Name: " + empName + ", Department: " + department;
    }
    void promote(String newDepartment){
        department = newDepartment;
        System.out.println(empName + " has been promoted to " + department + " department.");
    }

    public static void main(String[] args){
        Employee emp1 = new Employee("E001", "John Doe", "Sales", 50000);
        System.out.println();
        System.out.println(emp1.getEmployeeSummary());
        System.out.println("Basic Salary: " + emp1.basicSalary);
        double newSalary = emp1.calculateNetSalary(20);
        System.out.println("New Net Salary: " + newSalary);
        emp1.promote("Marketing");
        System.out.println(emp1.getEmployeeSummary());

        System.out.println();
    }
}
