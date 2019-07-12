package Exception;

import java.sql.SQLOutput;

public class exampleOne {
    public static void main(String[] args) {
        int numOne;
        int numTwo;

        try {
            numOne = 1;
            numTwo = 62/numOne;
            String str = "TT";
            System.out.println(str.charAt(2));
            System.out.println(numTwo);
            System.out.println("Inside Try catch block");

        } catch (ArithmeticException e){
            System.out.println("Number can not be divided by zero");
        } catch (NullPointerException e){
            System.out.println("String has a Null value");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Index value is outside of string range");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Outside of try catch block");

    }
}
