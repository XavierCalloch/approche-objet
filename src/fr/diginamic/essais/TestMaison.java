package fr.diginamic.essais;

import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maison = new Maison();
		Chambre chambre1 = new Chambre(10.0, 0);
		Chambre chambre2 = new Chambre(12.0, 1);
		Chambre chambre3 = new Chambre(11.0, 1);
		Salon salon = new Salon(30.0, 0);
		Cuisine cuisine = new Cuisine(15.0, 0);
		SalleDeBain salleDeBain1 = new SalleDeBain(5.0, 0);
		SalleDeBain salleDeBain2 = new SalleDeBain(4.0, 1);
		WC wc1 = new WC(2.0, 0);
		WC wc2 = new WC(2.0, 1);
		
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(salleDeBain1);
		maison.ajouterPiece(salleDeBain2);
		maison.ajouterPiece(wc1);
		maison.ajouterPiece(wc2);
		
		maison.ajouterPiece(null);
		/*
		 * Lorsque l'on passe null en paramètre de la méthode ajouterPiece(), on obtient une erreur.
		 * Java n'arrive pas à calculer la superficie totale de la maison.
		 */
		
		Chambre chambre4 = new Chambre(-10.0, 1);
		Chambre chambre5 = new Chambre(10.0, -1);
		maison.ajouterPiece(chambre4);
		maison.ajouterPiece(chambre5);
		/*
		 * Java compile même si la pièce a une superficie ou un étage négatif
		 */
		
		System.out.println("Superficie totale: " + maison.getSuperficieTotale());
		System.out.println("Superficie du RDC: " + maison.getSuperficieEtage(0));
		System.out.println("Superficie du 1er étage: " + maison.getSuperficieEtage(1));

	}

}
