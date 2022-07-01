package statickeyword;

public class Student {
    int rno;
    String name;
    static String schoolName;
    void display(){
        System.out.println(rno +":"+name+":"+schoolName);
    }
}
class StudentImpl{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.rno = 1;
        Student.schoolName = "JJ";

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rno = 2;
        Student.schoolName = "JJ";

        Student s3 = new Student();
        s3.name = "XYZ";
        s3.rno = 3;
        Student.schoolName = "RJ";
        s1.display();
        s2.display();
        s3.display();
    }
}