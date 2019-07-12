package Collections.SetInterface;

import Collections.MapInterface.CodeTest.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoOfTreeSet {

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(45);
        integers.add(65);
        integers.add(76);
        integers.add(23);
        System.out.println(integers);

        System.out.println("====TreeSet====");
        Set<Integer> set = new TreeSet<>(integers);
        System.out.println(set);

        Set<Person> personSet = new TreeSet<>();
        //personSet.add(new Person
    }
}
