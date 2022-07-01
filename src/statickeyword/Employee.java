package statickeyword;

public class Employee {
    int empNo;
    String empName;
    static String companyName;
    static void show(){
        ///empName = "Ajay";
        companyName = "codekul";
    }
    void display(){
        companyName = "codekul";
    }

}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee.show();
        Employee e = new Employee();
        e.display();
    }
}
