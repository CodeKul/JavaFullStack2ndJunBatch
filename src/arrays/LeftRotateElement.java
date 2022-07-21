package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateElement {
    public static void main(String[] args) {
        int a[] = {21, 82, 43, 67, 5};
        //45123
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no");//3
        int n = sc.nextInt();
        int index=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==n)
                index = i;
        }
        for (int i=index;i<a.length-1;i++){
            System.out.print(a[i+1] + " ");
        }
        for (int i=0;i<=index;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

    }
}
