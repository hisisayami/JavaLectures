package Operators.Instanceof_Operators;

public class instanceof_Keyword {
    /*
    The instanceof Keyword can be used to test if the object is of a specified type
    if (objectReference instanceof type)
     */

    public static void main(String[] args) {
        String s = "Hello";
        if (s instanceof java.lang.String) {
            System.out.println("is a String");

        }

        //However, applying instanceof on a null reference variable returns false.
        // For example, the following if statement returns false.

        String o = null;
        if (o instanceof java.lang.String) {

            System.out.println("true");

        } else{
            System.out.println("false");
        }
    }
}
