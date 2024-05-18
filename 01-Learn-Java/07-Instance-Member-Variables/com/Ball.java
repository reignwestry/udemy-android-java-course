package com.example.com;

    //Classes and Objects
    // Class are blueprints

    //Class
public class Ball {

    /*
        Public - anyone can access
        Private - Only accessed within the class
     */

        //Children Classes
        //Properties or instance variables
        public String color;
        public String name;
        public int capacity;
        public int bounceRate;

        //Behaviors
        public void bounces(){
            System.out.println("Bouncing...");
        }
        public void deflate(){
            System.out.println("deflating...");

        }
        public void inflates(){
            System.out.println("inflating...");

        }

    public static void main(String[] args){

    }
}