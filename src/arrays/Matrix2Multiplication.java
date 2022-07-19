package arrays;

public class Matrix2Multiplication {
    public static void main(String[] args) {
        int a[][] = {{4,5},{7,8}};
        int b[][] = {{1,9},{6,3}};
        int c[][] = new int[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                for (int k=0;k<2;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
