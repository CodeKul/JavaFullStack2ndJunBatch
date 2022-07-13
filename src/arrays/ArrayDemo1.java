package arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a1;//initialisation
        a1 = new int[10]; //instantiation
        //initialization
        a1[0] = 10;
        a1[1] = 20;
        a1[2] = 30;
        a1[3] = 40;
        a1[4] = 50;
        a1[8] = 70;
        System.out.println(a1[1]);//random access
        for (int i=0;i<10;i++){
            System.out.print(a1[i]+" ");
        }

    }
}
