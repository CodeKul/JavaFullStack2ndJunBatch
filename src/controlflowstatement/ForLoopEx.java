package controlflowstatement;

public class ForLoopEx {
    public static void main(String args[]){
        //simple for loop
        for (int i=0;i<3;i++){
            System.out.println(i);
        }
        //Nested for loop
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.println(i+" "+j);
            }
        }
    }
}
