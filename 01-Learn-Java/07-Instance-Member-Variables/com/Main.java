package com.example.com;
public class Main {

    public static void main(String[] args){
        //Object
        Ball myBall = new Ball();

        myBall.capacity = 10;

        BasketBall basketBall = new BasketBall();
        Baseball baseball = new Baseball();

        basketBall.color = "Blue";
        basketBall.name = "Basketball";
        basketBall.isNBA = true;
        basketBall.capacity = 23;

        baseball.color = "Brown";
        baseball.name = "Baseball";

        basketBall.bounce();
        basketBall.isNBA();

        System.out.println(myBall.capacity);
//        System.out.println(basketBall.isNBA() + ", capacity: " + basketBall.capacity);

    }
}
