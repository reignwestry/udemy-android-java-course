package com.example.com;

public class Main {



    public static void main(String[] args){


        //initialized a ball
//        Ball ball = new Ball("blue", "justBall", 12, 45);
        Ball ball = new Ball();

        ball.setName("Hello"); //Changes the set name to "Hello"
        ball.setName("NewName");
        ball.setColor("Red");
        ball.setBounceRate(435);
        ball.setCapacity(3);

        //ball.showColor();
        System.out.println(ball.getName());
        System.out.println(ball.getBounceRate());
        System.out.println(ball.getName() + ", " + ball.getColor() + ", " + ball.getBounceRate() + ", " + ball.getCapacity());
    }
}
