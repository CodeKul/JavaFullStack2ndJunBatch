package stringdemo;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        String []nameArray =  name.split(" ");
        System.out.println(nameArray.length);

        char firstInitial = nameArray[0].toUpperCase().charAt(0);
        char middleInitial = nameArray[1].toUpperCase().charAt(0);

        String lastName = nameArray[2].substring(0,1).toUpperCase().concat(nameArray[2].substring(1));
        String initialName = firstInitial+"."+middleInitial+"."+lastName;
        System.out.println(initialName);
    }
}
