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
			 * On commence par découper la ligne en morceaux sur la base du caractère
			 * séparateur « ; » . De plus on ne récupère que les morceaux qui nous
			 * intéressent. En l’occurrence on ignore les morceaux 3 et 4 dont on a pas
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
			 * Pour la population, avant la conversion en int, il faut d’abord supprimer les
			 * espaces qui se trouvent à l’intérieur
			 */
			int populationTotale = Integer.parseInt(population.replace(" ", "").trim());

			// On créé enfin la ville avec toutes les données utiles
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

		// On affiche la population de tout le département de l’Hérault

		System.out.println("");

		// Création du stockage des compteurs:
		// - clé de type String qui correspond à la catégorie: département de l’Hérault
		// - valeur de type Integer qui correspond à la population du département
		HashMap<String, Integer> compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			if (departement.equals("34")) { // code du département de l'Hérault

				// On recherche le compteur correspondant au département de la ville
				Integer compteur = compteurs.get(departement);

				// Si le compteur n'existe pas on le créé
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incrémente de la population de la ville courante, qu’il ait été extrait
				 * de la HashMap ou juste créé
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}

		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les
		 * catégories (départements) contenues dans la HashMap
		 */
		Set<String> departements = compteurs.keySet();
		Iterator<String> iterateur = departements.iterator();
		while (iterateur.hasNext()) {
			String departement = iterateur.next();
			Integer compteur = compteurs.get(departement);
			System.out.println("La population de tout le département de l'Hérault est:");
			System.out.println("Département: " + departement + " - Population totale: " + compteur + " habitants");
		}

		// On affiche la plus petite ville du département de l'Hérault
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
		System.out.println("La plus petite ville du département de l'Hérault est:\n" + villes.get(index).toString());

		// On affiche les 10 plus grandes villes du département de l'Hérault
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
		System.out.println("Les 10 plus grandes villes du département de l'Hérault sont:\n");
		for (int i = villesHerault.size() - 1; i > villesHerault.size() - 11; i--) {
			System.out.println(villesHerault.get(i) + "\n");
		}

		// On affiche les 10 plus petites villes du département de l'Hérault
		System.out.println("\nLes 10 plus petites villes du département de l'Hérault sont:\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(villesHerault.get(i) + "\n");
		}

		// On affiche la population de toute la région Occitanie

		// Création du stockage des compteurs:
		// - clé de type String qui correspond à la catégorie: région Occitanie
		// - valeur de type Integer qui correspond à la population de la région
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String region = ville.getNomRegion();

			if (region.equals("Occitanie")) {

				// On recherche le compteur correspondant à la région de la ville
				Integer compteur = compteurs.get(region);

				// Si le compteur n'existe pas on le créé
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incrémente de la population de la ville courante, qu’il ait été extrait
				 * de la HashMap ou juste créé
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(region, compteur);
			}
		}

		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les
		 * catégories (régions) contenues dans la HashMap
		 */
		Set<String> regions = compteurs.keySet();
		iterateur = regions.iterator();
		while (iterateur.hasNext()) {
			String region = iterateur.next();
			Integer compteur = compteurs.get(region);
			System.out.println("La population de toute la région " + region + " est:");
			System.out.println("Région: " + region + " - Population totale: " + compteur + " habitants");
		}

		// On affiche les 10 villes les plus importantes de la région Occitanie
		List<Ville> villesOccitanie = new ArrayList<>();
		iterator = villes.iterator();
		while (iterator.hasNext()) {
			Ville myVille = iterator.next();
			if (myVille.getNomRegion().equals("Occitanie")) {
				villesOccitanie.add(myVille);
			}
		}
		Collections.sort(villesOccitanie, new ComparatorPopulation());
		System.out.println("\nLes 10 villes les plus importantes de la région Occitanie sont:\n");
		for (int i = villesOccitanie.size() - 1; i > villesOccitanie.size() - 11; i--) {
			System.out.println(villesOccitanie.get(i) + "\n");
		}

		// On affiche le département le plus peuplé de la région Occitanie

		// Création du stockage des compteurs:
		// - clé de type String qui correspond à la catégorie: département de la région
		// Occitanie
		// - valeur de type Integer qui correspond à la population du département
		compteurs = new HashMap<>();

		// Codes des départements de la région Occitanie
		String[] deptsOccitanie = { "09", "11", "12", "30", "31", "32", "34", "46", "48", "65", "66", "81", "82" };
		List<String> listeDeptsOcc = Arrays.asList(deptsOccitanie);

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			if (listeDeptsOcc.contains(departement)) { // si le département de la ville courante fait partie de la
														// région Occitanie

				// On recherche le compteur correspondant au département de la ville
				Integer compteur = compteurs.get(departement);

				// Si le compteur n'existe pas on le créé
				if (compteur == null) {
					compteur = 0;
				}

				/*
				 * On l'incrémente de la population de la ville courante, qu’il ait été extrait
				 * de la HashMap ou juste créé
				 */
				compteur += ville.getPopulationTotale();

				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}

		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les
		 * catégories (départements de la région Occitanie) contenues dans la HashMap
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
		System.out.println("Le département le plus peuplé de la région Occitanie est: " + clePlusPeuple
				+ "\nPopulation: " + popDeptPlusPeuple + " habitants");

		// On affiche les 10 régions les plus peuplées de France

		// Création du stockage des compteurs:
		// - clé de type String qui correspond à la catégorie: région
		// - valeur de type Integer qui correspond à la population de la région
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String region = ville.getNomRegion();

			// On recherche le compteur correspondant à la région de la ville
			Integer compteur = compteurs.get(region);

			// Si le compteur n'existe pas on le créé
			if (compteur == null) {
				compteur = 0;
			}

			/*
			 * On l'incrémente de la population de la ville courante, qu’il ait été extrait
			 * de la HashMap ou juste créé
			 */
			compteur += ville.getPopulationTotale();

			// On le remet dans la map avec la nouvelle valeur
			compteurs.put(region, compteur);
		}

		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les
		 * catégories (régions) contenues dans la HashMap
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
		System.out.println("\nLes 10 régions les plus peuplées de France sont:\n");
		for (int i = listePopRegions.size() - 1; i > listePopRegions.size() - 11; i--) {
			System.out.println(listePopRegions.get(i) + "\n");
		}
		
		// On affiche les 10 départements les plus peuplés de France
		
		// Création du stockage des compteurs:
		// - clé de type String qui correspond à la catégorie: département
		// - valeur de type Integer qui correspond à la population du département
		compteurs = new HashMap<>();

		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();

			// On recherche le compteur correspondant au département de la ville
			Integer compteur = compteurs.get(departement);

			// Si le compteur n'existe pas on le créé
			if (compteur == null) {
				compteur = 0;
			}

			/*
			 * On l'incrémente de la population de la ville courante, qu’il ait été extrait
			 * de la HashMap ou juste créé
			 */
			compteur += ville.getPopulationTotale();

			// On le remet dans la map avec la nouvelle valeur
			compteurs.put(departement, compteur);
		}

		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les
		 * catégories (départements) contenues dans la HashMap
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
		System.out.println("\nLes 10 départements les plus peuplés de France sont:\n");
		for (int i = listePopDepts.size() - 1; i > listePopDepts.size() - 11; i--) {
			System.out.println(listePopDepts.get(i) + "\n");
		}

		// On affiche les 10 villes les plus peuplées de France
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

			// Poser une question Ã  l'utilisateur
			String choixMenu = scanner.nextLine();

			// Conversion du choix utilisateur en int
			choix = Integer.parseInt(choixMenu);

			// On exécute l'option correspondant au choix de l'utilisateur
			switch (choix) {
			case 4:
				String choix4 = "";
				String saisieMin4 = "";
				String saisieMax4 = "";
				
				try {
					System.out.println("Quel est le code du département recherché ? ");
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
						System.out.println("Veuillez saisir un minimum de population supérieur à 0: " + e.getMessage());
					}
					else if (Integer.parseInt(saisieMax4) < 0) {
						System.out.println("Veuillez saisir un maximum de population supérieur à 0: " + e.getMessage());
					}
					else if (Integer.parseInt(saisieMax4) < Integer.parseInt(saisieMin4)) {
						System.out.println("Veuillez saisir un maximum de population supérieur au minimum de population: " + e.getMessage());
					}
					else if (Integer.parseInt(choix4) < 1 || (Integer.parseInt(choix4) > 95 && Integer.parseInt(choix4) < 971 && Integer.parseInt(choix4) > 974)) {
						System.out.println("Veuillez saisir un code de département connu: " + e.getMessage());
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
		System.out.println("2. Rechercher la population d'un département");
		System.out.println("3. Rechercher la population d'une région");
		System.out.println("4. Rechercher la population des villes d'un dept entre min et max");
		System.out.println("99. Sortir");
	}
	
	/** Méthode qui détermine si une chaîne de caractères est un nombre
	 * @param s une chaîne de caractères
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
