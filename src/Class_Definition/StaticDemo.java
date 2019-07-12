package Class_Definition;

public class StaticDemo {

    /*
    1. Static block
    2. Static method
    3.Static variable
     */

    static void myMethod(){
        System.out.println("this is my method");
    }
    public static void main(String[] args) {
        myMethod();
        System.out.println("value of sum: " + num);
        System.out.println("Value of str:" + str);
    }

    static int num;
    static String str;

    //eg static block and is only associate with class not instance of class
    static {
        num = 50;
        str = "Test Static Block";
    }

    static {
        num = 55;
        str = "test";
    }
}
