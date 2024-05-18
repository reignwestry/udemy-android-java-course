package com.example.com;

public class BasketBall extends Ball {

    //Properties
    private boolean isNBA;
    private int capacity;

    //Behaviors
    public boolean isNBA(){

        if(isNBA == true){
            return true;
        }else {
            return false;
        }
    }
}
