package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Intro {

    public static void main(String[] args) {

        //List declaration
        List<String> nameList = new ArrayList<>();

        //List declaration With class declaration? same as above
        //ArrayList<String> list = new ArrayList<>();

        System.out.println(nameList);

        //Adding to array
        nameList.add("John");
        nameList.add ("Sam");
        nameList.add ("Mike");

        System.out.println(nameList);


        System.out.println("===== Using For loop =======");
        for (int i = 0; i <nameList.size(); i++){
            System.out.println(nameList.get(i)); //to print in another line or separately
        }

        // using iterator class
        Iterator<String > iterator = nameList.iterator();

        System.out.println("======= Using Iterator Class ==========");
        while (iterator.hasNext()){ //hasNext() checks if there is next element or not
            System.out.println(iterator.next());

        }

    }
}
