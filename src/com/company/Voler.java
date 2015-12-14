package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Voler implements Deplacement{
    @Override
    public void deplacer() {
        System.out.println("Je vole!!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vole");
        return sb.toString();
    }
}
