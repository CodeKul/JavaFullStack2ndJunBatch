package constructor;

//Default Constructor
public class Employee {
    int id;
    String name;
    String companyName;
    Employee(){
        System.out.println("In Default Constructor");
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Company Name: "+companyName);
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee();
        e2.display();
    }
}