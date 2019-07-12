package Exception;

import java.util.Arrays;

public class ExampleTwo {
    public static void main(String[] args) {

    try{
        int arr[] = new int[7];
        arr[4] = 30;
        System.out.println(Arrays.toString(arr));
        arr[5] = 23 / 0;
        System.out.println("In try block");
    } catch(ArithmeticException e) {
        System.out.println("Warning: Arithmetic Exception");
    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("outside of array");
    } catch(Exception e) {
        System.out.println("Sth went wrong");
    }

}

}
