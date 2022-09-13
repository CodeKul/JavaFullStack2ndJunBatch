package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private String empCode;
    private Integer age;
    private Double salary;

    public Employee(String name, String empCode, Integer age) {
        this.name = name;
        this.empCode = empCode;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empCode='" + empCode + '\'' +
                ", age=" + age +
                '}';
    }
}

class EmpNameComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class EmpAgeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge().compareTo(e2.getAge());
    }
}

class EmpComparatorImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aishwarya","EMP-001",23);
        Employee e2 = new Employee("Namrata","EMP-002",24);
        Employee e3 = new Employee("Janhavi","EMP-003",20);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Collections.sort(employees,new EmpAgeComparator().reversed());
        System.out.println("By using Age");
        for (Employee e:employees){
            System.out.println(e.toString());
        }
        Collections.sort(employees,new EmpNameComparator());
        System.out.println("By using Name");

        for (Employee e:employees){
            System.out.println(e.toString());
        }
    }
}