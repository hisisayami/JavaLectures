package ControlFlow.IF_Block.ForLoop.ForLoop;

public class ForLoop_Intro {
    public static void main(String[] args) {
        //print 0 to 5 in sysout

        for (int i =0; i <=5; i++){
           System.out.println(i + " ");
        }

        ////////////////////////////////////////////////

        int n =2; //global variale
        for (; n <= 5; n++){
            //System.out.println(n);
        }
        System.out.println(n);

        /////////////////////////////////////////////////

        int j =0;
        System.out.println(j++);
        System.out.println(j);

        ////////////////////////////////////////////////

        int m =0;
        for (; ; ) {
            //print the value of n
            System.out.println("Value of m is :" + n);

            //post increment the valur of n
            n++;

            if (n > 4){
                break;
            }


        }
    }









}
