package com.company;

/**
 * Created by lenoubun16 on 6/27/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

    public Car(String color, String brand, int topSpeed){
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go() {
        System.out.println("Go Go");
    }

    public void slow() {
        System.out.println("Slow");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public String getmColor() {
        return mColor;
    }

    public String getmBrand() {
        return mBrand;
    }

    public int getmTopSpeed() {
        return mTopSpeed;
    }

    public void setmColor(String color) {
        mColor = color;
    }

    public void setmBrand(String brand)  {
        mBrand = brand;
    }

    public  void setmTopSpeed (int topSpeed) {
        mTopSpeed = topSpeed;
    }

}
