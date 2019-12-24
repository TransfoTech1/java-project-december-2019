package package5;

import java.util.HashMap;

public class HashMapPratice {

    public static void main(String[] args) {
        // map --> key value pair
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("transfotech", "jamaica");
        hashMap.put("whatever", "bronx");
        hashMap.put("something", "NJ");
        hashMap.put("dfsrf", "ferf");
        System.out.println(hashMap.get("transfotech"));
        System.out.println(hashMap.get("whatever"));
        System.out.println(hashMap.get("something"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());

        hashMap.remove("dfsrf");
        System.out.println(hashMap.size());
        System.out.println(hashMap);

        HashMap<String, Integer> citiesHashMap = new HashMap<>();

        citiesHashMap.put("rego park", 11374);
        citiesHashMap.put("woodside", 11371);


        System.out.println(citiesHashMap);


    }
}
