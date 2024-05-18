package com.example.com;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        //Hashmaps
        // === a sophisticated arrayList, key, value pair, dictionary
        // Hashmaps (key --> value) pair
        // .put() === adds to the Hashmap
        // .entrySet() === is the whole Hashmap

        HashMap users = new HashMap();
        users.put("Sandra", 23);
        users.put("Paul", 31);
        users.put("George", 74);

        //<Integer> === is an object
        //<Integer, String> == specifies that the key has to be a Integer and the value is a String
        HashMap<Integer, String> newUsers = new HashMap<>(); //Says the key has to be Integer, value has to be a String
        newUsers.put(23, "Sandra");

//        users.remove("Sandra"); //note removes the Sandra key

//        System.out.println(users.entrySet()); //note how to get whole hashMap

        //note how to get a specific key
//        System.out.println(users.get("Sandra")); //23


        //note Iterate (Loop) through the HashMap
        Iterator myIterator = users.entrySet().iterator(); //initialize
        while(myIterator.hasNext()){
            Map.Entry pair = (Map.Entry) myIterator.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

    }
}
