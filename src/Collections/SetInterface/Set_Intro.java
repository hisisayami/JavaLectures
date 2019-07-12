package Collections.SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Intro {

    public static void main(String[] args) {

        Set <Integer> numList = new HashSet<>();
        numList.add(23);
        numList.add(34);
        numList.add(45);
        numList.add(23);
        numList.add(67);
        System.out.println(numList);

        //it does not take duplicate value
        //HashSet will not provide any order


        //TreeSet will provide ascending order
        Set <Integer> integers = new TreeSet<>(numList);
        System.out.println(integers);

    }
}
