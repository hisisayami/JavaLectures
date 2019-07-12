package Exception;

//public class ProductValidation {
//    public void productCheck(int weight) throws InvalidProductException {
//        if (weight < 100){
//            throw new InvalidProductException("Product Invalid");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        ProductValidation validation = new ProductValidation();
//        try {
//            validation.productCheck(60);
//            System.out.println("Valid Product....");
//        } catch (InterruptedException e) {
//            System.out.println("Catch the exception");
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//class InvalidProductException extends Exception{
//    public InvalidProductException(String str) {
//
//        //Calling the constructor from parent/super class
//        super(str);
//    }
//}
