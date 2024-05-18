package com.example.com;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args){

        //ArrayList
        // === a resizeable array
        // use .size() instead of .length === to tell how big the list is



        //create an arrayList
//        ArrayList<String> animals = new ArrayList(); //note String is for smart FOR loop
        ArrayList animals = new ArrayList();
        animals.add("Pig");
        animals.add("Cow");
        animals.add("Parrot");
        animals.add("Cheetah");

//        animals.remove( 0); //note: removes a specific element from the index without changing the original
//        animals.add(0, "Dog"); //note: adds specific element to a new index
//        animals.remove("Cow"); //note temp removes all elements with "Cow"

        //note Check if the arrayList contains something
        if( animals.contains("Parrot")) {
            animals.remove("Parrot");
            System.out.println("Removed Parrot");
        }else {
            System.out.println("Nope");
        }

        // Loops through the arrayList
        for(int i = 0; i < animals.size(); i++){

            //# .get() === grabs the element from the arrayList
//            System.out.println(animals.get(0));

            System.out.println("Animals: " + animals.get(i));
        }

        //note: ALTERNATE smart for loop
        for (Object animal : animals){
            System.out.println(animal);
        }


    }
}
