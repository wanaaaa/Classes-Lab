package com.company;

/**
 * Created by lenoubun16 on 6/27/16.
 */
public class StopLight {
    String mlightColor;

    public StopLight(String lightColor){
        mlightColor = lightColor;
    }

    public boolean isRed() {
        String str = mlightColor;
        if (str.equals("red")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isYellow() {
        String str = mlightColor;
        if (str.equals("yellow")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isGreen() {
        String str = mlightColor;
        if (str.equals("green")) {
            return true;
        } else {
            return false;
        }
    }


    public void setlightColor(String lightColor) {
        mlightColor = lightColor;
    }


}
