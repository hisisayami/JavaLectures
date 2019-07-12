package ControlFlow.IF_Block.ForLoop.ForLoop;

public class CodeTestTwo {
//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
//    The array will be length 1 or more.
//
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public static void main(String[] args) {
        int firstLast6[] = {1,2,6};


        //for(int i =0; i< firstLast6.length; i++){
            if (firstLast6[firstLast6.length-1] == 6 || firstLast6[0] == 6){
                System.out.println("true");

            }
       // }

    }

}


//} public static void ArrayCount(int arrayCountOne[]) {
//
//    // int arrayCountOne[] = {1, 2, 9};
//    //int arrayCounttwo [] = {1, 9, 9};
//    //int arrayCountthree [] = {1, 9, 9, 3, 9};
//    int count = 0;
//
//    for (int i = 0; i < arrayCountOne.length; i++) {
//        if (arrayCountOne[i] == 9) {
//            count++;
//        }
//    }
//    System.out.println(count);
//}



