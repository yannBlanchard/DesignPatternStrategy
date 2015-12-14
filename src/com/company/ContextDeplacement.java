package com.company;

/**
 * Created by yablanch on 14/12/2015.
 */
public class ContextDeplacement {
    private Deplacement deplacement;

    public ContextDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    public void executeStrategy(){
        deplacement.deplacer();
    }
}
