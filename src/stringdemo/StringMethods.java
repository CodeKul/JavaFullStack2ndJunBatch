package stringdemo;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Why rain brings Delhi to knees in a few hours: Waterbodies in disrepair, lack of local drains";
        System.out.println("Upper Case: "+str.toUpperCase());
        System.out.println("Lower Case: "+str.toLowerCase());
        System.out.println("Char At: "+str.charAt(3));
        System.out.println("Concat: "+str.concat(" Pvt. Ltd."));
        System.out.println("Replace: "+str.replace("in","at"));
        System.out.println("Replace All "+str.replaceAll("in","at"));
        System.out.println("Contains "+str.contains("brings"));
        System.out.println(str);


    }
}
