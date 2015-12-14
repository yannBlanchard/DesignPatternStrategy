package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Canon implements Attaque  {

    @Override
    public void attaquer() {
        System.out.println("canon");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Canon");
        return sb.toString();
    }
}
