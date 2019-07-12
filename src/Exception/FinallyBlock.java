package Exception;

public class FinallyBlock {
    /*
    try {}
    catch () {
    } finally {
    }
     */
    public static void main(String[] args) {

    }

    public static void withFinally() {
        try {
            int num = 120 / 0;
            System.out.println(num);

        } catch (ArithmeticException e) {
            System.out.println("Exception");

        } finally {
            System.out.println("This is finally block");
            try {
                System.out.println("something");
            } finally {
                System.out.println("This is sub finally block");
            }
        }
    }
}