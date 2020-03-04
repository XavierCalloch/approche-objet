package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne("Dubois", "Pierre");
		Personne personne2 = new Personne("Dupont", "Paul");
		
		AdressePostale ap1 = new AdressePostale(10, "avenue des Grives", 56100, "Lorient");
		AdressePostale ap2 = new AdressePostale(11, "avenue des Grives", 56100, "Lorient");
		
		Personne personne3 = new Personne("Dubois", "Pierre", ap1);
		Personne personne4 = new Personne("Dupont", "Paul", ap2);
		
		// Il y a désormais besoin de moins de lignes de code pour instancier une personne
		
		String nomPrenom = personne1.afficherNomPrenom();
		System.out.println(nomPrenom);
		
		AdressePostale ap3 = new AdressePostale(8, "rue des Mésanges", 56100, "Lorient");
		personne3.modifierAdresse(ap3);
		// ou personne3.modifierAdresse(AdressePostale(9, "rue des Mésanges", 56100, "Lorient"))
		System.out.println(personne3.retournerAdresse());
		
		
		// Correction
		AdressePostale adr1 = personne3.retournerAdresse();
		System.out.println(adr1); // Sortie : Java n'est pas en mesure d'afficher une variable que l'on a créée (retourne l'adresse mémoire ?)
		
		
		/*
		personne1.nom = "Dubois";
		personne1.prenom = "Pierre";
		AdressePostale ap1 = new AdressePostale();
		ap1.numeroRue = 10;
		ap1.libelleRue = "avenue des Grives";
		ap1.codePostal = 56100;
		ap1.ville = "Lorient";	
		personne1.adressePostale = ap1;
		
		personne2.nom = "Dupont";
		personne2.prenom = "Paul";
		AdressePostale ap2 = new AdressePostale();
		ap2.numeroRue = 11;
		ap2.libelleRue = "avenue des Grives";
		ap2.codePostal = 56100;
		ap2.ville = "Lorient";	
		personne2.adressePostale = ap2;
		*/

	}

}
