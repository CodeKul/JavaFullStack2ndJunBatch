package controlflowstatement;

/**
 * There are 4 types of if statements
 * 1. Simple if
 * 2. if-else stmt
 * 3. if-else-if ladder
 * 4. Nested if
 * <p>
 * *** Switch Statement -
 * switch(expr) //int,short,byte,char,
 * Integer,Short,Byte,String - java 7{
 * case 1: // cases can not be duplicate
 * stmts;
 * break;// terminates switch block
 * case 2:
 * stmts;
 * break;
 * .
 * .
 * .
 * .case 10;
 * default: // optional
 * stmts
 * }
 */
public class DecisionMakingStatement {
    public static void main(String args[]) {
        String city = "Pune";
        if (city == "Pune")
            System.out.println("You are from Pune");
        else
            System.out.println("You are from Mumbai");

        if (city == "Mumbai")
            System.out.println("You are from Mumbai");
        else if (city == "Goa")
            System.out.println("You are from Goa");
        else
            System.out.println("You are from Pune");


        String country = "India";
        if (country == "India") {
            if (city == "Goa") {
                System.out.println("Goa is in India");
            } else {
                if (city == "Pune") {
                    System.out.println("Pune is in India");
                }
            }
        } else {
            System.out.println("You are from other country");

        }

        int ch = 2;
        switch (ch) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No matching found");
        }


    }
}
