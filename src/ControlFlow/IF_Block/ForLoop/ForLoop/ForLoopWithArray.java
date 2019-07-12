package ControlFlow.IF_Block.ForLoop.ForLoop;

public class ForLoopWithArray {
    public static void main(String[] args) {
        //Array can hold more than one value at a time..
        //Array always starts with index zero (position)

        int arr[] = {1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[2]);

        int []arrOne = new int[3]; //size of an arrOne is 3 here
        System.out.println(arrOne[0]);


        //assigning the value in arrOne
        arrOne[0] = 4;
        arrOne[1] = 7;
        arrOne[2] = 9;

        System.out.println(arrOne[0]); //prints 4 since position 0 holds value 4

        int arrTwo[] = {2,11,45,9};

        for(int i = 0; i < arrTwo.length; i++){
            System.out.println(i); //prints the position of i only
            System.out.println(arrTwo[i] + " "); //prints the value of arrTwo in the positions
        }


    }
}
