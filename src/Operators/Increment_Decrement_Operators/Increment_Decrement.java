package Operators.Increment_Decrement_Operators;

public class Increment_Decrement {
    public static void main(String[] args) {
        int count = 10;

        ++count; // add 1 to count
        --count; // subtract 1 from count

        System.out.println(count);

        int a =1;
        int b=2;
        int c;
        int d;

        c= ++ b; // 3
        d = a++; // print the 1 and then ass value
        c++; // 3 print and then it will add the value

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //using the increment and decrement operators in an expression

        int numA = 5;
        int numB =10;
        int numC = 0;

        numC = ++numA + numB;

        System.out.println(numA);
        System.out.println(numC);

        //Pre fix and post fix

        numC = ++numA + numB;

        System.out.println(numA);
        System.out.println(numC);

        numC = --numA + numB--;
        System.out.println(numA);
        System.out.println(numC);

        //Using Floatin numbers

        double v =12.12;
        System.out.println(v--);
        System.out.println(v++);
        System.out.println(--v);
        System.out.println(++v);



    }
}
