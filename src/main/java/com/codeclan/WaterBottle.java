package com.codeclan;

public class WaterBottle {
    private int volume=100; // can do this way

//    private int volume; // or this way
//    public WaterBottle(){ // no difference
//        this.fill();
//    }
    public int getVolume(){
        return volume;
    }
    public void drink(){
        volume-=10;
    }
    public void empty(){
        volume=0;
    }
    public void fill(){
        volume=100;
    }
}
