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
				
				/* On l'incr�mente de la population de la ville courante, qu�il ait �t� extrait de la HashMap
				 * ou juste cr��
				 */
				compteur += ville.getPopulationTotale();
				
				// On le remet dans la map avec la nouvelle valeur
				compteurs.put(departement, compteur);
			}
		}
		
		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les cat�gories (d�partements)
		 * contenues dans la HashMap
		 */
		Set<String> departements = compteurs.keySet();
		Iterator<String> iterateur = departements.iterator();
		while (iterateur.hasNext()) {
			String departement = iterateur.next();
			Integer compteur = compteurs.get(departement);
			System.out.println("D�partement: " + departement + " - Population totale: " + compteur);
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
		
		/*
		// On affiche les 10 plus grandes villes du d�partement de l'H�rault
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
			
			if (departement.equals("34")) { // code du d�partement de l'H�rault
				treemap.put(nomCommune, ville.getPopulationTotale());
			}
			
		}
		
		/*
		 * On affiche maintenant les r�sultats en utilisant un it�rateur sur les villes
		 * contenues dans la TreeMap
		 */
		/*
		Set<String> villesTreeMap = treemap.keySet();
		Iterator<String> iterateurTreeMap = villesTreeMap.iterator();
		while (iterateurTreeMap.hasNext()) {
			String villeTreeMap = iterateurTreeMap.next();
			Integer compteur = treemap.get(villeTreeMap);
			System.out.println("D�partement: " + departement + " - Population totale: " + compteur);
		}
		*/
			

	}

}
