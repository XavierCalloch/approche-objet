package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		// Affichage du premier caract�re de la cha�ne de caract�res
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caract�re: " + premierCaractere);
		
		// Affichage de la taille de la cha�ne de caract�res
		System.out.println(chaine.length());
		
		// Affichage de l�index du premier � ; � contenu dans la cha�ne de caract�res
		System.out.println(chaine.indexOf(';'));
		
		// Extraction du nom de famille de la personne
		String nom = chaine.substring(chaine.indexOf(premierCaractere), chaine.indexOf(';'));
		
		// Affichage du nom de famille en majuscules
		System.out.println(nom.toUpperCase());
		
		// Affichage du nom de famille en minuscules
		System.out.println(nom.toLowerCase());
		
		// D�coupage de la cha�ne de caract�res en morceaux et affichage du tableau obtenu
		String[] arrOfStr = chaine.split(";");
		
		for (int i = 0; i < arrOfStr.length; i++) {
			System.out.println(arrOfStr[i]);
		}
		
		// Cr�ation d'une instance des classes Personne (client) et Compte
		Personne client = new Personne(nom, arrOfStr[1]);
		
		String replaceStr = arrOfStr[3].replace(" ", "");
		double solde = Double.parseDouble(replaceStr);
		Compte compte = new Compte(arrOfStr[2], solde);
		
		client.afficherIdentite();
		System.out.println(compte.toString());

	}

}
