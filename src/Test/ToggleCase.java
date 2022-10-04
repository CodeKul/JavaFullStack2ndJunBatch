package Test;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "CoDeKUL123";
        if (!str.isEmpty()){
            char[]chr = str.toCharArray();
            for (int i=0;i<chr.length;i++){
                int asciiValue = chr[i];
                //small letter
                if (asciiValue>=97 && asciiValue<=122){
                    asciiValue = asciiValue-32;
                    System.out.print((char)asciiValue);
                }else if (asciiValue>=65 && asciiValue<=90){
                    asciiValue = asciiValue+32;
                    System.out.print((char)asciiValue);

                }else {
                    System.out.println();
                    System.out.print(chr[i] +" Invalid input");
                }
            }
        }
    }
}
