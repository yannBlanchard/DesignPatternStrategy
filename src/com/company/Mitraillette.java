package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Mitraillette implements Attaque{
    @Override
    public void attaquer() {
        System.out.println("Mitraillette");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mitraillette");
        return sb.toString();
    }
}
