package Collections.ListInterface;

import java.util.*;

public class LinkedList_Intro {

    public static void main(String[] args) {

      LinkedList <Integer> numList = new LinkedList<Integer>(Arrays.asList(34,56,4,5,67,87,67));

        System.out.println(numList);

        //Make it thread safe
       Collections.synchronizedCollection(numList);

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                Iterator<Integer> iterator = numList.iterator();
                while (iterator.hasNext()){

                    try{
                        Thread.sleep(500);

                    }catch (InterruptedException e) {
                        e.getMessage();
                    }
                    }
                    System.out.println("This is thread one" + iterator.next());


            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {

                Iterator<Integer> iterator = numList.iterator();
                while (iterator.hasNext()){

                    try{
                        Thread.sleep(500);

                    }catch (InterruptedException e) {
                        e.getMessage();
                    }
                    System.out.println("This is thread Two" + iterator.next());
                }

            }
        });

        threadOne.start();
        threadTwo.start();

    }

}
