package ControlFlow.IF_Block.ForLoop.ForLoop;

public class CodeTest {


//        Q. Given an array of ints, return the number of 9's in the array.
//        arrayCount9([1, 2, 9]) → 1
//        arrayCount9([1, 9, 9]) → 2
//        arrayCount9([1, 9, 9, 3, 9]) → 3

    public static void ArrayCount(int arrayCountOne[]) {

       // int arrayCountOne[] = {1, 2, 9};
        //int arrayCounttwo [] = {1, 9, 9};
        //int arrayCountthree [] = {1, 9, 9, 3, 9};
        int count = 0;

        for (int i = 0; i < arrayCountOne.length; i++) {
            if (arrayCountOne[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

        //Q. return true if array contain number 9 between position 0 to 4

        public static void arrayFront9 (int arrayFront9[]) {

           // int arrayFront9[] = {1, 2, 9, 3, 4};

            if (arrayFront9.length > 4) {
                System.out.println("skip");


                for (int i = 0; i < arrayFront9.length -1; i++) {
                    if (arrayFront9[i] == 9) {
                        System.out.println("true");

                    }

                }
            }
        }




    public static void main(String[] args) {
            //int y[] = {1, 2, 9};
           // ArrayCount(y);

            int a[] = {1, 2, 9, 3, 4};
            arrayFront9(a);

    }

}






//    int arrTwo[] = {2,11,45,9};
//
//        for(int i = 0; i < arrTwo.length; i++){
//        System.out.println(i); //prints the position of i only
//        System.out.println(arrTwo[i] + " "); //prints the value of arrTwo in the positions
//        }
