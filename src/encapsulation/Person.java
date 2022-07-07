package encapsulation;

public class Person {
    private int pid;
    private String firstName;
    private String lastName;
    private String fullName;
    public void setPid(int pid){
        this.pid = pid;
    }
    public int getPid(){
        return pid;
    }
    public String getFullName() {
        fullName = firstName+" "+lastName;
        return fullName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
class PersonImpl{
    public static void main(String[] args) {
        Person person = new Person();
        person.setPid(101);
        person.setFirstName("Abhishek");
        person.setLastName("Jadhav");

        System.out.println("Pid: "+person.getPid());
        System.out.println("Full Name: "+person.getFullName());
    }
}
