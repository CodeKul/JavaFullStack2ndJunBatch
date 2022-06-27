/**
 * Types of Operators in Java
 * 1. Unary Operator -> expr++,expr--,++expr,--expr,~,!
 * 2. Arithmetic Operator -> +,-,*,/,%
 * 3. Shift Operators ->  <<,>>
 * 4. Logical Operators -> Logical AND (&&),Logical OR (||)
 * 5. Bitwise Operators -> Bitwise AND (&),Bitwise OR(|)
 * 6. Ternary Operators -> ? :
 * 7. Assignment Operators -> = ,!=,+=,-=,*=,/=,%=,&=,^=,|=
 * 8. Relational Operators -> <,>,<=,>=
 */
public class Operators {
    public static void main(String... args) {
        int a = 30;
        boolean flag = false;
        System.out.println(a++);//30
        System.out.println(--a);// 30
        System.out.println(++a); //31
        System.out.println(a--); //31
        System.out.println(~a); //(-a)-1 = -30-1 = -31
        System.out.println(!flag);
        int x = 10;
        int y = 20;
        int z = 30;
        float f = 5 / 2;
        //Assignment Operator
        System.out.println(x + y); //30
        System.out.println(y - x); //10
        System.out.println(x * z); //300
        System.out.println(z / x);  //3
        System.out.println(z % x); //0
        //Shift Operators
        System.out.println(x << 2);//10*2^2 = 10*4=40
        System.out.println(x << 3);//10*2^3 = 10*8 =80
        System.out.println(x >> 2); //10/2^2 = 10/4 = 2
        System.out.println(x >> 3); //10/2^3 = 10/8=1
        //Logical & Bitwise Operator
        System.out.println(x < y && y > z);
        System.out.println(x < y & y > z);
        System.out.println(z < y || y > x);
        System.out.println(z < y | y > x);

        //Ternary operator
        System.out.println(x > y ? "x is max" : "y is max");


    }
}
