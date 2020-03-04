package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cc = new Compte("56897143", 100.0);
		//System.out.println(cc);
		/*
		 * Affichage de l'adresse mémoire du compte : n'arrive pas à afficher le compte
		 * (affichage sous forme de chaîne de caractères)
		 */
		
		CompteTaux ct = new CompteTaux("15894637", 300.00, 1.5);
		
		Compte[] arrayCompte = new Compte[2];
		
		arrayCompte[0] = cc;
		arrayCompte[1] = ct;
		
		double soldeGlobal = 0;
		for (int i = 0; i < arrayCompte.length; i++) {
			System.out.println(arrayCompte[i].toString());
			soldeGlobal = soldeGlobal + arrayCompte[i].getSolde();
		}
		System.out.println("Solde global: " + soldeGlobal);

	}

}
