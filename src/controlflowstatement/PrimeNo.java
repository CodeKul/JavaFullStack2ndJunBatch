package controlflowstatement;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < no / 2; i++) {
            if (no % i == 0) {
                flag = false;
                break;
            } else {
                flag = true;

            }
        }
        System.out.println(flag ? "Given no is not prime" : "Given no is prime");
    }
}
