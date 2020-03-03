package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adresse1 = new AdressePostale();
		AdressePostale adresse2 = new AdressePostale();
		
		adresse1.numeroRue = 5;
		adresse1.libelleRue = "rue des Merles";
		adresse1.codePostal = 56000;
		adresse1.ville = "Vannes";
		
		adresse1.numeroRue = 10;
		adresse1.libelleRue = "avenue des Grives";
		adresse1.codePostal = 56100;
		adresse1.ville = "Lorient";

	}

}
