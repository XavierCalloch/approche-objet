package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) throws IOException { // ou rajouter throws IOException

		Scanner scanner = new Scanner(System.in);

		// try {
		List<Ville> villes = new ArrayList<>();

		// On lit le fichier
		File file = new File("C:/Users/xavie/Documents/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");

		for (String ligne : lignes) {
			System.out.println(ligne);
		}

		System.out.println("Nombre de lignes :" + lignes.size());

		for (int i = 1; i < lignes.size(); i++) {
			/*
			 * On commence par d�couper la ligne en morceaux sur la base du caract�re
			 * s�parateur � ; � . De plus on ne r�cup�re que les morceaux qui nous
			 * int�ressent. En l�occurrence on ignore les morceaux 3 et 4 dont on a pas
			 * besoin dans le TP
			 */
			String ligne = lignes.get(i);
			String[] morceaux = ligne.split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[7];

			/*
			 * Pour la population, avant la conversion en int, il faut d�abord supprimer les
			 * espaces qui se trouvent � l�int�rieur
			 */
			int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

			// On cr�� enfin la ville avec toutes les donn�es utiles
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

			// On place cette instance de ville dans la liste
			villes.add(ville);
		}

		/*
		 * } catch (IOException e) { System.out.println(e.getMessage()); }
		 */

		// On recherche dans la liste la ville de Montpellier et on affiche toutes les
		// informations la concernant
		System.out.println("");
		for (Ville ville : villes) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println(ville.toString());
			}
		}

		// On affiche la population de tout le d�partement de l�H�rault

		System.out.println("");

		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui correspond � la cat�gorie: d�partement de l�H�rault
		// - valeur de type Integer qui correspond � la population du d�partement
		HashMap<String, Integer> compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			if (departement.equals("34")) { // code du d�partement de l'H�rault

				// On recherche le compteur correspondant au d�partement de la ville
				Integer compteur = compteurs.get(departement);

				// Si le compteur n'existe pas on le cr��
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait
				 * de la HashMap ou juste cr��
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}

		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les
		 * cat�gories (d�partements) contenues dans la HashMap
		 */
		Set<String> departements = compteurs.keySet();
		Iterator<String> iterateur = departements.iterator();
		while (iterateur.hasNext()) {
			String departement = iterateur.next();
			Integer compteur = compteurs.get(departement);
			System.out.println("La population de tout le d�partement de l'H�rault est:");
			System.out.println("D�partement: " + departement + " - Population totale: " + compteur + " habitants");
		}

		// On affiche la plus petite ville du d�partement de l'H�rault
		System.out.println("");
		int index = 0;
		Ville moinsPeuplee = villes.get(0);
		int min = moinsPeuplee.getPopulationTotale();
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getPopulationTotale() < min && villes.get(i).getCodeDepartement().equals("34")) {
				min = villes.get(i).getPopulationTotale();
				index = i;
			}
		}
		System.out.println("La plus petite ville du d�partement de l'H�rault est:\n" + villes.get(index).toString());

		// On affiche les 10 plus grandes villes du d�partement de l'H�rault
		System.out.println("");
		List<Ville> villesHerault = new ArrayList<>();
		Iterator<Ville> iterator = villes.iterator();
		while (iterator.hasNext()) {
			Ville myVille = iterator.next();
			if (myVille.getCodeDepartement().equals("34")) {
				villesHerault.add(myVille);
			}
		}
		Collections.sort(villesHerault, new ComparatorPopulation());
		System.out.println("Les 10 plus grandes villes du d�partement de l'H�rault sont:\n");
		for (int i = villesHerault.size() - 1; i > villesHerault.size() - 11; i--) {
			System.out.println(villesHerault.get(i) + "\n");
		}

		// On affiche les 10 plus petites villes du d�partement de l'H�rault
		System.out.println("\nLes 10 plus petites villes du d�partement de l'H�rault sont:\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(villesHerault.get(i) + "\n");
		}

		// On affiche la population de toute la r�gion Occitanie

		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui correspond � la cat�gorie: r�gion Occitanie
		// - valeur de type Integer qui correspond � la population de la r�gion
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String region = ville.getNomRegion();

			if (region.equals("Occitanie")) {

				// On recherche le compteur correspondant � la r�gion de la ville
				Integer compteur = compteurs.get(region);

				// Si le compteur n'existe pas on le cr��
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait
				 * de la HashMap ou juste cr��
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(region, compteur);
			}
		}

		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les
		 * cat�gories (r�gions) contenues dans la HashMap
		 */
		Set<String> regions = compteurs.keySet();
		iterateur = regions.iterator();
		while (iterateur.hasNext()) {
			String region = iterateur.next();
			Integer compteur = compteurs.get(region);
			System.out.println("La population de toute la r�gion " + region + " est:");
			System.out.println("R�gion: " + region + " - Population totale: " + compteur + " habitants");
		}

		// On affiche les 10 villes les plus importantes de la r�gion Occitanie
		List<Ville> villesOccitanie = new ArrayList<>();
		iterator = villes.iterator();
		while (iterator.hasNext()) {
			Ville myVille = iterator.next();
			if (myVille.getNomRegion().equals("Occitanie")) {
				villesOccitanie.add(myVille);
			}
		}
		Collections.sort(villesOccitanie, new ComparatorPopulation());
		System.out.println("\nLes 10 villes les plus importantes de la r�gion Occitanie sont:\n");
		for (int i = villesOccitanie.size() - 1; i > villesOccitanie.size() - 11; i--) {
			System.out.println(villesOccitanie.get(i) + "\n");
		}

		// On affiche le d�partement le plus peupl� de la r�gion Occitanie

		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui correspond � la cat�gorie: d�partement de la r�gion
		// Occitanie
		// - valeur de type Integer qui correspond � la population du d�partement
		compteurs = new HashMap<>();

		// Codes des d�partements de la r�gion Occitanie
		String[] deptsOccitanie = { "09", "11", "12", "30", "31", "32", "34", "46", "48", "65", "66", "81", "82" };
		List<String> listeDeptsOcc = Arrays.asList(deptsOccitanie);

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			if (listeDeptsOcc.contains(departement)) { // si le d�partement de la ville courante fait partie de la
														// r�gion Occitanie

				// On recherche le compteur correspondant au d�partement de la ville
				Integer compteur = compteurs.get(departement);

				// Si le compteur n'existe pas on le cr��
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait
				 * de la HashMap ou juste cr��
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}

		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les
		 * cat�gories (d�partements de la r�gion Occitanie) contenues dans la HashMap
		 */
		departements = compteurs.keySet();
		iterateur = departements.iterator();
		String clePlusPeuple = iterateur.next();
		Integer popDeptPlusPeuple = compteurs.get(clePlusPeuple);
		while (iterateur.hasNext()) {
			String cleCourant = iterateur.next();
			Integer popCourant = compteurs.get(cleCourant);
			if (popCourant > popDeptPlusPeuple) {
				clePlusPeuple = cleCourant;
				popDeptPlusPeuple = popCourant;
			}
		}
		System.out.println("Le d�partement le plus peupl� de la r�gion Occitanie est: " + clePlusPeuple
				+ "\nPopulation: " + popDeptPlusPeuple + " habitants");

		// On affiche les 10 r�gions les plus peupl�es de France

		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui correspond � la cat�gorie: r�gion
		// - valeur de type Integer qui correspond � la population de la r�gion
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String region = ville.getNomRegion();

			// On recherche le compteur correspondant � la r�gion de la ville
			Integer compteur = compteurs.get(region);

			// Si le compteur n'existe pas on le cr��
			if (compteur == null) {
				compteur = 0;
			}

			/*
			 * On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait
			 * de la HashMap ou juste cr��
			 */
			compteur += ville.getPopulationTotale();

			// On le remet dans la map avec la nouvelle valeur
			compteurs.put(region, compteur);
		}

		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les
		 * cat�gories (r�gions) contenues dans la HashMap
		 */
		System.out.println("");
		Set<String> setRegions = compteurs.keySet();
		Iterator<String> keysIte = setRegions.iterator();
		while (keysIte.hasNext()) {
			String cle = keysIte.next();
			int courant = compteurs.get(cle);
			System.out.println(cle + " -> " + courant);
		}
		
		Collection<Integer> popRegions = compteurs.values();
		List<Integer> listePopRegions = new ArrayList<>(popRegions);
		Collections.sort(listePopRegions);
		System.out.println("\nLes 10 r�gions les plus peupl�es de France sont:\n");
		for (int i = listePopRegions.size() - 1; i > listePopRegions.size() - 11; i--) {
			System.out.println(listePopRegions.get(i) + "\n");
		}
		
		// On affiche les 10 d�partements les plus peupl�s de France
		
		// Cr�ation du stockage des compteurs:
		// - cl� de type String qui correspond � la cat�gorie: d�partement
		// - valeur de type Integer qui correspond � la population du d�partement
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			// On recherche le compteur correspondant au d�partement de la ville
			Integer compteur = compteurs.get(departement);

			// Si le compteur n'existe pas on le cr��
			if (compteur == null) {
				compteur = 0;
			}

			/*
			 * On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait
			 * de la HashMap ou juste cr��
			 */
			compteur += ville.getPopulationTotale();

			// On le remet dans la map avec la nouvelle valeur
			compteurs.put(departement, compteur);
		}

		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les
		 * cat�gories (d�partements) contenues dans la HashMap
		 */
		System.out.println("");
		departements = compteurs.keySet();
		keysIte = departements.iterator();
		while (keysIte.hasNext()) {
			String cle = keysIte.next();
			int courant = compteurs.get(cle);
			System.out.println(cle + " -> " + courant);
		}

		Collection<Integer> popDepts = compteurs.values();
		List<Integer> listePopDepts = new ArrayList<>(popDepts);
		Collections.sort(listePopDepts);
		System.out.println("\nLes 10 d�partements les plus peupl�s de France sont:\n");
		for (int i = listePopDepts.size() - 1; i > listePopDepts.size() - 11; i--) {
			System.out.println(listePopDepts.get(i) + "\n");
		}

		// On affiche les 10 villes les plus peupl�es de France
		iterator = villes.iterator();
		Collections.sort(villes, new ComparatorPopulation());
		System.out.println("\nLes 10 plus grandes villes de France sont:\n");
		for (int i = villes.size() - 1; i > villes.size() - 11; i--) {
			System.out.println(villes.get(i) + "\n");
		}

		// Menu
		int choix = 0;
		do {

			// Affichage du menu
			afficherMenu();

			// Poser une question à l'utilisateur
			String choixMenu = scanner.nextLine();

			// Conversion du choix utilisateur en int
			choix = Integer.parseInt(choixMenu);

			// On ex�cute l'option correspondant au choix de l'utilisateur
			switch (choix) {
			case 4:
				String choix4 = "";
				String saisieMin4 = "";
				String saisieMax4 = "";
				
				try {
					System.out.println("Quel est le code du d�partement recherch� ? ");
					choix4 = scanner.nextLine();
					
					System.out.println("Choississez une population minimum (en milliers d'habitants): ");
					saisieMin4 = scanner.nextLine();
					
					System.out.println("Choississez une population maximum (en milliers d'habitants): ");
					saisieMax4 = scanner.nextLine();
					
					int min4 = Integer.parseInt(saisieMin4) * 1000;
					int max4 = Integer.parseInt(saisieMax4) * 1000;

					for (Ville ville : villes) {
						if (ville.getCodeDepartement().equalsIgnoreCase(choix4)) {
							if (ville.getPopulationTotale() >= min4 && ville.getPopulationTotale() <= max4) {
								System.out.println(ville);
							}
						}
					}
				} catch (Exception e) {
					if (isNumeric(saisieMin4) == false) {
						System.out.println("Veuillez saisir un chiffre et non une lettre pour le minimum de population: " + e.getMessage());
					}
					else if (isNumeric(saisieMax4) == false) {
						System.out.println("Veuillez saisir un chiffre et non une lettre pour le maximum de population: " + e.getMessage());
					}
					else if (Integer.parseInt(saisieMin4) < 0) {
						System.out.println("Veuillez saisir un minimum de population sup�rieur � 0: " + e.getMessage());
					}
					else if (Integer.parseInt(saisieMax4) < 0) {
						System.out.println("Veuillez saisir un maximum de population sup�rieur � 0: " + e.getMessage());
					}
					else if (Integer.parseInt(saisieMax4) < Integer.parseInt(saisieMin4)) {
						System.out.println("Veuillez saisir un maximum de population sup�rieur au minimum de population: " + e.getMessage());
					}
					else if (Integer.parseInt(choix4) < 1 || (Integer.parseInt(choix4) > 95 && Integer.parseInt(choix4) < 971 && Integer.parseInt(choix4) > 974)) {
						System.out.println("Veuillez saisir un code de d�partement connu: " + e.getMessage());
					}
				}
				break;
			}
		} while (choix != 99);
		
		scanner.close();

	}

	/**
	 * Affichage du menu
	 */
	private static void afficherMenu() {
		System.out.println("***** Recensement population *****");
		System.out.println("1. Rechercher la population d'une ville");
		System.out.println("2. Rechercher la population d'un d�partement");
		System.out.println("3. Rechercher la population d'une r�gion");
		System.out.println("4. Rechercher la population des villes d'un dept entre min et max");
		System.out.println("99. Sortir");
	}
	
	/** M�thode qui d�termine si une cha�ne de caract�res est un nombre
	 * @param s une cha�ne de caract�res
	 * @return boolean
	 */
	public static boolean isNumeric(String s) {
		if (s == null || s.equals("")) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

}
