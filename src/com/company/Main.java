package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*ContextDeplacement ctxDeplacement = new ContextDeplacement(new Courir());
        ctxDeplacement.executeStrategy();
        Unite bob = new Unite(ctxDeplacement);*/

        Unite unite1 = new Unite("Bob",new Voler(),new LanceFlamme());
        unite1.afficher();
        unite1.seDeplacer();

        Unite unite2 = new Unite("Toto", new Courir(),new Missile());
        unite2.afficher();
        unite2.combattre();
    }
}
