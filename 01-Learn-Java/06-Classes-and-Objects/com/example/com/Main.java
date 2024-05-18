package com.example.com;
public class Main {

    public static void main(String[] args){
        //Object
        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        secondBall.name = "SoccerBall";
        secondBall.color = "Brown";

        myBall.color = "Blue";
        myBall.name = "Basketball";

        System.out.println(myBall.name);
    }
}
