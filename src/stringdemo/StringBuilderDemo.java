package stringdemo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Codekul");
        System.out.println(builder);
        builder.append(" Pvt.");
        System.out.println(builder);
        builder.append(" Ltd.");
        System.out.println(builder);
        builder.insert(0,"**");
        System.out.println(builder);

    }
}
