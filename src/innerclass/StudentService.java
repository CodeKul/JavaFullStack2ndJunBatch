package innerclass;

public interface StudentService {
    void getStudent();
    void addStudent(int rno,String name);
}
class StudentServiceImpl{

    public static void main(String[] args) {
        StudentService studentService = new StudentService() {
            int rno = 0;
            String name = null;
            @Override
            public void getStudent() {
                System.out.println(rno+ " "+name);
            }

            @Override
            public void addStudent(int rno, String name) {
                this.rno = rno;
                this.name = name;
            }
        };
        studentService.addStudent(1,"ABC");
        studentService.getStudent();
    }
}
