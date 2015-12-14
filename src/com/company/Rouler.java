package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Rouler implements Deplacement{
    @Override
    public void deplacer() {
        System.out.println("Rouler");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rouler");
        return sb.toString();
    }
}
