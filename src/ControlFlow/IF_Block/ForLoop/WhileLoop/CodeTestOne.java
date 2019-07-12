package ControlFlow.IF_Block.ForLoop.WhileLoop;

import java.util.Random;

public class CodeTestOne {

    ///////////print the 10 random decimal number

    public static void main(String[] args) {
        double r = 0;
        Random random = new Random();
        while ( r < 0.99) {
            r = random.nextDouble();
            System.out.println(r);
        }

    }
}


