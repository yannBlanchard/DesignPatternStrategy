package com.company;

import java.util.ArrayList;

/**
 * Created by yablanch on 14/12/2015.
 */
public class Unite{
    private Deplacement deplacement;
    private Attaque attaque;
    private String nom;

    public Unite(String nom,Deplacement deplacement, Attaque attaque) {
        this.nom = nom;
        this.deplacement = deplacement;
        this.attaque = attaque;
    }

    public void seDeplacer(){
        deplacement.deplacer();
    }
    public void combattre(){
        attaque.attaquer();

    }


    public void afficher() {
        StringBuilder str = new StringBuilder("Unite ");
        str.append(nom);
        str.append(" : \n");
        str.append("Arme : ");
        str.append(attaque);
        str.append("\n");
        str.append("Type de deplacement : ");
        str.append(deplacement);
        str.append("\n");
        System.out.println(str);
    }

}
