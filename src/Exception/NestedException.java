package Exception;

public class NestedException {
    public static void main(String[] args) {
        //Main try
        try {
            //second try block
            try {
                //third try block
                try{
                    int arr[] = {1,2,3,4};
                    System.out.println(arr[10]);

                }catch (ArithmeticException e){
                    System.out.println("Arithmetic Exception");
                    System.out.println();
                }

            }catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
                System.out.println("In second try catch block");
            }

        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println("In main try-block");

        } catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
            System.out.println("In main try-block");
        } catch (Exception e){
            System.out.println("sth went wrong");
            System.out.println("In main try-block");

        }
    }
}
