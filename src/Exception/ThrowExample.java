package Exception;

public class ThrowExample {
    public static void main(String[] args) {

    }
    static void checkEleigility (int stuAge, int stuWeight){
        if (stuAge < 12 && stuWeight < 40){
            throw new ArithmeticException("Student is not eligible");
        } else {
            System.out.println("Student is eligible");
        }

    }
}
