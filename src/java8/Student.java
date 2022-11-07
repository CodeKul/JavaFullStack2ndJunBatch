package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private Integer id;
    private Double percentage;

    public Student(String name, Integer id, Double percentage) {
        this.name = name;
        this.id = id;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", percentage=" + percentage +
                '}';
    }
}
class StudentImpl{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> distinctionStudent = new ArrayList<>();
        Student s1 = new Student("Abhishek",1,89.9);
        students.add(s1);
        Student s2 = new Student("Neha",2,76.9);
        students.add(s2);
        Student s3 = new Student("Rita",3,81.9);
        students.add(s3);

        for (Student s :students ){
            if (s.getPercentage()>80){
                distinctionStudent.add(s);
                System.out.println("Name "+s.getName());
            }
        }
        //Java 8
        distinctionStudent = students.stream()
                .filter(student -> student.getPercentage() > 80)
                .limit(1)
                .collect(Collectors.toList());

        System.out.println(distinctionStudent);
    }
}