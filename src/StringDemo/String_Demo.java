package StringDemo;

public class String_Demo {
    public static void main(String[] args) {

        //Concat

        String str = "Hello";
        String str1 = "Hellooo";
        String strTwo = "World!";

        System.out.println(str + strTwo);
        System.out.println(str.concat(strTwo));

        //HashCode method....
       //hashcode belongs to value of var


        System.out.println(str.hashCode());
        System.out.println("Hello".hashCode());
        System.out.println(str1.hashCode());

        //Contains (always return a boolean value)

        System.out.println("Java Learning!!".contains("Java"));

        //compareTo()//

        System.out.println("apple".compareTo("banana")); //it uses dictionary index


        //compareToignoreCase()

        System.out.println("apple".compareTo("Apple"));
        System.out.println("apple".compareToIgnoreCase("Apple"));

    }
}
