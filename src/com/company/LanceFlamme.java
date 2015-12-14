package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class LanceFlamme implements Attaque {

    @Override
    public void attaquer() {
        System.out.println("Lance flamme");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LanceFlamme");
        return sb.toString();
    }
}
