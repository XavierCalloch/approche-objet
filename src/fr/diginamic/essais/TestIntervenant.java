package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie salarie = new Salarie();
		salarie.setNom("Besnard");
		salarie.setPrenom("Louis");
		salarie.setSalaire(1500.00);
		// System.out.println(salarie.getSalaire());
		System.out.println(salarie.afficherDonnees());
		
		System.out.println(" ");
		
		Pigiste pigiste = new Pigiste();
		pigiste.setNom("Morin");
		pigiste.setPrenom("Alfred");
		pigiste.setMontantJournRemu(150.00);
		pigiste.setNbJoursTrav(10);
		// System.out.println(pigiste.getSalaire());
		System.out.println(pigiste.afficherDonnees());

	}

}
