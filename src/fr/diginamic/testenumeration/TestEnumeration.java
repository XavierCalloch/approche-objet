package fr.diginamic.testenumeration;

import fr.diginamic.testenumeration.Saison;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison[] saisons = Saison.values();
		
		// On affiche toutes les saisons contenues dans l’énumération
		for (Saison s: saisons) {
			System.out.println(s);
		}
		
		// On retrouve et affiche l’énumération dont le nom est ETE
		String nom = "ETE";
		Saison s = Saison.valueOf(nom);
		System.out.println("");
		//System.out.println(s.getLibelle() + " " + s.getNumeroOrdre());
		System.out.println(s);
		
		// On vérifie le fonctionnement de la méthode getInstanceSaison(String libelle) de Saison
		String libelle = "Hiver";
		s = Saison.getInstanceSaison(libelle);
		System.out.println("");
		System.out.println(s);

	}

}
