package fr.diginamic.recensement;

import fr.diginamic.recensement.Ville;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) throws IOException { // ou rajouter throws IOException
		
		//try {
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
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println(villes.get(i));
			System.out.println("");
		}
		*/
		
		// On recherche dans la liste la ville de Montpellier et on affiche toutes les informations la concernant
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
				
				/* On l'incrémente de la population de la ville courante, qu’il ait été extrait de la HashMap
				 * ou juste créé
				 */
				compteur += ville.getPopulationTotale();
				
				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}
		
		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les catégories (départements)
		 * contenues dans la HashMap
		 */
		Set<String> departements = compteurs.keySet();
		Iterator<String> iterateur = departements.iterator();
		while (iterateur.hasNext()) {
			String departement = iterateur.next();
			Integer compteur = compteurs.get(departement);
			System.out.println("Département: " + departement + " - Population totale: " + compteur);
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
		
		/*
		// On affiche les 10 plus grandes villes du département de l'Hérault
		 * 
		System.out.println("");
		Collections.sort(villes);
		for (int i = 0; i < villes.size(); i++) {
			if (villes.get(i).getCodeDepartement().equals("34")) {
				System.out.println(villes.get(i).toString());
				System.out.println("");
			}
		}
		*/
		
		
		System.out.println("");
		
		Map<String, Integer> treemap = new TreeMap<String, Integer>();
		
		// Parcours de la liste des villes
		for (int i = 0; i < villes.size(); i++) {
			Ville ville = villes.get(i);
			String departement = ville.getCodeDepartement();
			String nomCommune = ville.getNomCommune();
			
			if (departement.equals("34")) { // code du département de l'Hérault
				treemap.put(nomCommune, ville.getPopulationTotale());
			}
			
		}
		
		/*
		 * On affiche maintenant les résultats en utilisant un itérateur sur les villes
		 * contenues dans la TreeMap
		 */
		/*
		Set<String> villesTreeMap = treemap.keySet();
		Iterator<String> iterateurTreeMap = villesTreeMap.iterator();
		while (iterateurTreeMap.hasNext()) {
			String villeTreeMap = iterateurTreeMap.next();
			Integer compteur = treemap.get(villeTreeMap);
			System.out.println("Département: " + departement + " - Population totale: " + compteur);
		}
		*/
			

	}

}
