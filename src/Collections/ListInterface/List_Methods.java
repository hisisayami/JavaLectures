package Collections.ListInterface;

import java.util.*;
import java.util.function.Predicate;

public class List_Methods {

    public static void main(String[] args) {

        // TODO: 2019-07-11
        /*
        1. ArrayList add() method example
        2. ArrayList addAll() method example
        3. ArrayList clear() method example
        4. ArrayList clone() – How to clone an ArrayList
        5. ArrayList contains() method example
        6. ArrayList ensureCapacity() method example
        7. ArrayList forEach() method example
        8. ArrayList get() method example
        9. ArrayList indexOf() method example
        10. ArrayList lastIndexOf() method example
        11. ArrayList listIterator() method example
        12. ArrayList remove() method example
        13. ArrayList removeAll() method example
        14. ArrayList retainAll() method example
        15. ArrayList replaceAll() method example
        16. ArrayList removeIf() method example
        17. ArrayList sort() method example
        18. ArrayList spliterator() method example
        19. ArrayList subList() method example
        20. ArrayList toArray() method example
         */

        ArrayList<String> list = new ArrayList<>();

        //1. ArrayList add() method example
        list.add("JAMES");
        list.add("JOHN");
        list.add("ROBERT");
        list.add("MICHAEL");
        list.add("DAVID");
        list.add("OLIVIA");
        list.add("EMILY");
        list.add("SOPHIA");
        list.add("MIA");
        System.out.println(list);

        //2. ArrayList addAll() method example
        // add All method will add another list into same list
        //has to be the same data types

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Oliver");
        nameList.add("Ava");
        nameList.add("Emma");

        list.addAll(nameList);
        System.out.println(list);

        //3. ArrayList clear() method example
        //list.clear();
        //System.out.println(list);

        //4. ArrayList clone() – How to clone an ArrayList
        //It copies the existing list and create another list.

        ArrayList<String> templist = (ArrayList<String>) list.clone();
        System.out.println("======This is Temp List=====");
        System.out.println(templist);

        //5. ArrayList contains() method example - to check the value in list
        //it return the boolean value

        boolean nameCheck = list.contains("Emma");
        System.out.println(nameCheck);

        //6. ArrayList ensureCapacity() method example
        list.ensureCapacity(40);

        //7. ArrayList forEach() method example
        list.forEach(name -> System.out.println(name.toLowerCase())); // '->' this is lamda expression
        list.forEach(name -> System.out.println(name.toUpperCase()));

        //8. ArrayList get() method example
        System.out.println("======This is GET Method=====");
        System.out.println(list.get(3));

        //9. ArrayList indexOf() method example
        System.out.println(list.indexOf("MIA"));

        //10. ArrayList lastIndexOf() method example
        System.out.println(list.lastIndexOf("DAVID"));

        //11. ArrayList listIterator() method example
        ListIterator<String> listIterator = list.listIterator();

        System.out.println("======Print List forward======");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("======Print List Backward======");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //12. ArrayList remove() method example
        //removes specific element from the list

        System.out.println("======Remove method======");
        list.remove("OlIVIA");
        System.out.println(list);

        //13. ArrayList removeAll() method example
        System.out.println("======RemoveAll method======");
        list.removeAll(Collections.singleton("DAVID"));
        System.out.println(list);

        //14. ArrayList retainAll() method example
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B","A","D","A"));
        System.out.println("====== Alphabets List=====");
        System.out.println(alphabets);

        alphabets.retainAll(Collections.singleton("A"));
        System.out.println(alphabets);

        //15. ArrayList replaceAll() method example
        alphabets.replaceAll(e-> e.toLowerCase());
        System.out.println(alphabets);

        //16. ArrayList removeIf() method example
        //based on some condition

        System.out.println("====== RemoveIF Method List=====");
        list.removeIf(n -> n.startsWith("J"));
        System.out.println(list);

        //17. ArrayList sort() method example

        System.out.println("====== Sorting the List=====");
        Collections.sort(list);
        System.out.println(list);

        // 18. ArrayList spliterator() method example

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2,4,5,6,7,8,9,3));
        System.out.println("========= Number List======");
        System.out.println(numbers);

        Spliterator<Integer> spliterator = numbers.spliterator();

        spliterator.tryAdvance(num-> System.out.println(num));
        spliterator.tryAdvance(num-> System.out.println(num));
        spliterator.tryAdvance(num-> System.out.println(num));


        //19. ArrayList subList() method example
        ArrayList<Integer> subListOne = new ArrayList<Integer>(Arrays.asList(2,4,5,6,7,8,9,3));
        ArrayList<Integer> subListTwo = new ArrayList<Integer>(Arrays.asList(2,4,5,6));
        System.out.println(subListOne);
        System.out.println(subListTwo);
        System.out.println(subListOne.subList(2,4)); //similar to substring

        // 20. ArrayList toArray() method example

        ArrayList<Integer> tlist = new ArrayList<>();
        tlist.add (12);
        tlist.add (22);
        tlist.add (34);
        tlist.add (23);
        System.out.println(tlist);

        //changing arrayList into array
        Integer arr[] = tlist.toArray(new Integer[tlist.size()]);
        System.out.println(Arrays.toString(arr));

        //arr[6] = 9; returns exception error since its array not the arraylist. If it was arraylist it would return -1 not error


    }
}
