package DayOne;

public class Boolean_Intro {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = (10 > 20) ? true : false;
        System.out.println (b3);

        if (b3 ) {
            System.out.println(" This is true");
        } else {
            System.out.println(" This is false");

            //Wrapper class in java
         Boolean bull = Boolean.valueOf("TRUE");
         System.out.println(bull);



        }

    }
}
