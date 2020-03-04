package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		// Création d'un compte
		Compte cc = new Compte("56897143", 100.0);
		//System.out.println(cc);
		/*
		 * Affichage de l'adresse mémoire du compte : n'arrive pas à afficher le compte
		 * (affichage sous forme de chaîne de caractères)
		 */
		
		// Création d'un compte taux
		CompteTaux ct = new CompteTaux("15894637", 300.00, 1.5);
		
		// Création d'un tableau de comptes pouvant contenir 2 comptes
		Compte[] arrayCompte = new Compte[2];
		
		// Remplissage du tableau de comptes
		arrayCompte[0] = cc;
		arrayCompte[1] = ct;
		
		// Affichage des informations des divers comptes ainsi que le solde global
		double soldeGlobal = 0;
		for (int i = 0; i < arrayCompte.length; i++) { // ou i <= arrayCompte.length - 1
			System.out.println(arrayCompte[i].toString()); // voir plus bas
			soldeGlobal = soldeGlobal + arrayCompte[i].getSolde();
		}
		System.out.println("Solde global: " + soldeGlobal);
		
		
		// Correction
		
		// Compte[] comptes = ...
		// comptes[0] = new Compte(...)
		// comptes[1] = new CompteTaux(...)
		
		/*
		 * double soldeGlobal = 0.0;
		for (int i = 0; i <= arrayCompte.length - 1; i++) { // ou i <= arrayCompte.length - 1
			System.out.println(arrayCompte[i]);
			soldeGlobal += comptes[i].getSolde();
		}
		*/

	}

}
