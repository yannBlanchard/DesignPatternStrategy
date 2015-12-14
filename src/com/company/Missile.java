package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Missile implements Attaque {

    @Override
    public void attaquer() {
        System.out.println("missille");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Missile");
        return sb.toString();
    }
}
