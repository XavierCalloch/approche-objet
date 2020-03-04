package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte compte = new Compte(54763987, 436);
		System.out.println(compte);
		// Affichage de l'adresse mémoire du compte

	}

}
