package essais;

import entites.Personne;
import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
		
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

	}

}
