package ControlFlow.IF_Block;

import java.util.Random;

public class AllAboutIF_Block {
    public static void main(String[] args) {
        //if condition
        //if (true) {}

        if (false) {
            System.out.println("This is true");

        } else {
            System.out.println("The condition is false");
        }

        ////////////////////////////////

        int num = 5;

        Random random = new Random();

        int i = random.nextInt(7);

        System.out.println(i);

        System.out.println(i);


        if (num <= i) {
            System.out.println(" This is if block;");
        } else {
            System.out.println("This is else block");
        }

        //////////////////////////////////////////////

        int numberOfLoginAttempts = 10;
        int numberOfMinimumLoginAttempts = 12;
        int numberOfMaxLoginAttempts = 13;
        int y = 3;

        //count the number login attempts and
        // provide if or else condition

        if (numberOfLoginAttempts < numberOfMaxLoginAttempts || numberOfMinimumLoginAttempts > y) {
            y++;
            System.out.println(y);
        }

        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("Value of a:" + a);
        System.out.println("Value of b:" + b);

        if (a>0 || b>5 ) {
            System.out.println("if block");
        } else {
            System.out.println("else block");
        }

    }
}

