package Collections.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        //HashMap declaration
        Map<Integer, String> map = new HashMap<>();

        //Add the data

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "A");
        map.put(5, "B");
        map.put(6, "C");

        System.out.println(map);

        //read the specific data set
        String value = map.get(2);
        System.out.println("This is value of key:" + value);

        //remove the data
        map.remove(3);
        System.out.println("====== Remove Method======");
        System.out.println(map);

        //how to loop HashMap

        //Loop via key only
        Iterator<Integer> iterator = map.keySet().iterator(); //keySet() reads value via given key
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String valueOne = map.get(key);
            System.out.println("This is Key: " +  key + " and Value is: " + valueOne);
        }

        //OR can be done this way too
        //Loop via key and value both
        Iterator<Map.Entry<Integer,String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){

            Map.Entry<Integer,String> entry = entryIterator.next();
            System.out.println("This is key:" + entry.getKey() + " this is value:" + entry.getValue());
        }

        /*
        1. One HashMap with k = Float type and Value Long
        2. Add the data
        3. Remove one entry
        4. Loop via key and Key/Value
         */

        Map <Float,Long> map2 = new HashMap<>();
        System.out.println(map2);

        map2.put(1.1F, 5L);
        map2.put(2.1F, 4L);
        map2.put(3.1F, 3L);
        map2.put(4.1F, 2L);
        System.out.println(map2);

        map2.remove(4.1F);
        System.out.println("=== Removed 4.1F ===");
        System.out.println(map2);

        Iterator<Map.Entry<Float,Long>> entryIterator2 = map2.entrySet().iterator();
        while (entryIterator2.hasNext()){

            Map.Entry<Float,Long> entry = entryIterator2.next();
            System.out.println("This is Key:" + entry.getKey() + " this is value:" + entry.getValue());
        }


    }
}
