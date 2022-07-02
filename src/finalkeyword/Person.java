package finalkeyword;


public class Person {
    int empId;
    String name;
    final String PAN_NO = "AMPFT2453L";
    final String AADHAR_NO;
    final String MOBILE_NO;
    static final String BIRTH_DATE;

    static {
        BIRTH_DATE = "15/09/1998";
    }
    Person(String aadhar_no, String mobileNo){
        AADHAR_NO = aadhar_no;
        MOBILE_NO = mobileNo;
    }

}

class PersonImpl{
    public static void main(String[] args) {
        Person person = new Person("789865324152","9865324152");
    }
}
