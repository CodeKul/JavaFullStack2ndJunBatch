package arrays;

import java.util.Collection;

public class DuplicateElements {
    public static void main(String[] args) {
        int a[] = {1, 1, 5, 3, 9, 8, 6, 1, 5, 4};

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j] + " ");
                    break;
                }
            }
        }
    }
}
