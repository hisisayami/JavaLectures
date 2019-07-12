package ControlFlow.IF_Block;

import java.util.Scanner;

public class CodeTest {

    public static <staic> void main(String[] args) {

        //testTwo ();
        //testOne ();

    }

    /////////////
    //1. Write a java program to get a number from the user and print weather it is positive or negative
    static void testOne() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");

        int a = scan.nextInt();

        if (a<=0) {
            System.out.println(" This is negative");
        } else{
            System.out.println("This is positive");
        }

    }

    ////////////////////////////

    //2. take 3 numbers from the user and print greatest number

    static void testTwo () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1st number:");
        System.out.println("Enter your 2nd number:");
        System.out.println("Enter your 3rd number:");

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if (x>y)
            if (x>z)
                System.out.println(" greatest is " + x );


        if (y>x)
            if (y>z)
                System.out.println(" greatest is " + y );

         if (z>x)
             if (z>y)
                 System.out.println(" greatest is " + z);





    }

    /////////////////////////////

    //3.  Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    // Otherwise, print "positive" or "negative".
    // Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000

    static void testThree () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        float f1 = scan.nextInt();

        if (f1 > 0) {
            if (f1 < 1){
                System.out.println("Small");
            }
            else if (f1  > 1000000) {
                System.out.println("It is a positive and large");
            }
            else {
                System.out.println("positive");
            }
        }

        else if(f1 < 0) {
            System.out.println("negative");

        }else {
            System.out.println("zero");
        }
    }

    ///////////////////////////////
    //4. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

    static void testFour () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        System.out.println("Enter your 2nd number");

        float a1 = scan.nextInt();
        float a2 = scan.nextInt();

        ///if (a1/1000)



    }

    }

