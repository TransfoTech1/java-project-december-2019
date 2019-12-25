package package5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("NY");
        arrayList.add("NJ");
        arrayList.add("VA");
        System.out.println(arrayList.size());
        arrayList.add("FL");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

        //print all values from arraylist using for loop

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());


        System.out.println("******************");


        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add(1);
        objectArrayList.add("New York");
        objectArrayList.add("Queens");
        objectArrayList.add(true);


        System.out.println(objectArrayList);

        for (int x = 0; x < objectArrayList.size(); x++) {
            System.out.println(objectArrayList.get(x));
        }

        Iterator iterator = objectArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
