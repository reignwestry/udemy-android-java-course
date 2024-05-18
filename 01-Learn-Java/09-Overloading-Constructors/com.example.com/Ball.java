package com.example.com;

public class Ball {
    /*
        ACCESS MODIFIERS
        ================

        Public - anyone can access
        Private - Only accessed within the class
     */

    //Properties or instance variables
    private String color;
    private String name;

    private int capacity;
    private int bounceRate;

    //default constructor
    public Ball(){

    }

    //constructors must have the same name as the class

    //constructor
    public Ball(String mColor, String mName, int mCapacity, int mBounceRate) {

        color = mColor;
        name = mName;
        capacity = mCapacity;
        bounceRate = mBounceRate;
    }

    //Overriding Constructor
    public Ball(String mColor, String mName){
        color = mColor;
        name = mName;
    }

    //Overriding Constructor
    public Ball( String mColor, String mName, int mCapacity){

    }

    //GETTERS AND SETTERS
    //* SIMPLIFIES FOR MORE FLEXIBILITY
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Behaviors
    public void showName(){ System.out.println(name);}
    public void showColor(){System.out.println(color);}
    public void bounce(){ System.out.println("Bouncing..");}
    public void deflate(){ System.out.println("Deflating....");}
    public void inflates(){ System.out.println("Inflating..");}
}
