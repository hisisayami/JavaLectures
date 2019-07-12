package DayOne.referencedatatype;

public class String_Intro {

    public static void main(String[] args) {

        String strOne = "1" + "2";
        System.out.println (strOne);
        String strTwo = strOne + "= 4";
        System.out.println (strTwo);

        String name = "JavaClass";

        int length = name.length(); // used int to store value
        System.out.println("Name length is:" + length);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String s1 = "Java";
        String s2 = "AAAA";


        //to check the value of s1 and s1.
        // method#1
        System.out.println(s1 == s2);

        //method#2
        boolean b1 = s1.equals(s2);
        System.out.println(b1);

        String str = "abcde";

        if (str.startsWith ("ab")){
            System.out.println("True it's starts with ab");

        }
        else {
            System.out.println (false);
        }

        if (str.endsWith("de")){
            System.out.println("True it's ends with de");

        }
        else{
            System.out.println(false);

        }


     }
}
