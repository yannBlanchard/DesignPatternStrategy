package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Courir implements Deplacement {
    @Override
    public void deplacer() {
        System.out.println("Je cours");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Courir");
        return sb.toString();
    }
}
