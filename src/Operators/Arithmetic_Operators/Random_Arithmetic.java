package Operators.Arithmetic_Operators;

import java.util.Random;

public class Random_Arithmetic {
    static void printInt (String s, int i) {
        System.out.println (s + "=" + i);

    }

    static void printFloat (String s, float f) {
        System.out.println (s + "=" + f);

    }

    public static void main(String[] args) {
        Random rand = new Random();
        int i, j, k;

        j = rand.nextInt(100) + 1;
        k = rand.nextInt(100) + 1;
        printInt( "j", j);
        printInt( "k", k);

        i = j + k;
        printInt ("j +k", i);
        i = j - k;
        printInt ("j - k", i);
        i = j / k;
        printInt ("j / k", i);
        i = j * k;
        printInt ("j * k", i);
        i = j % k;
        printInt ("j % k", i);


        //Floating-point number tests:
        float u, v, w;

        //applies to doubles, too
        v = rand.nextFloat() +1;
        w = rand.nextFloat() +1;

        printFloat("v", v);
        printFloat("w",w);

        u = v + w;
        printFloat("j + k", u);
        u = v - w;
        printFloat("j - k", u);
        u = v / w;
        printFloat("j / k", u);
        u = v * w;
        printFloat("j * k", u);
        u = v % w;
        printFloat("j % k", u);

        //the following also works for char, byte, short, int,long and double:

        u += v;











    }
}
