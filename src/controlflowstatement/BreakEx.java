package controlflowstatement;

public class BreakEx {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==7)
                break;
            System.out.println("Value of i: "+i);
        }

        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
