package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cc = new Compte("A124", 100.0);
		System.out.println(cc);
		/*
		 * Affichage de l'adresse mémoire du compte : n'arrive pas à afficher le compte
		 * (affichage sous forme de chaîne de caractères)
		 */

	}

}
