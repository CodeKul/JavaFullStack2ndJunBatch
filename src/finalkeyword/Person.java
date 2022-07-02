package finalkeyword;


public class Person {
    int empId;
    String name;
    final String PAN_NO = "AMPFT2453L";
    final String AADHAR_NO; //blank final variable
    final String MOBILE_NO; //blank final variable
    static final String BIRTH_DATE; //blank static final variable

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
