package Exception;

public class NullPointException {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.charAt(2));
        } catch (NullPointerException e){
            System.out.println("NULL VALUE");
        }
    }
}
