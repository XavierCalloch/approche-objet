package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// On ajoute dans mapVilles les informations pour Lille, Lyon et Bordeaux
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// On affiche l'ensemble des clés contenues dans la map
		Iterator<Integer> keysIte = mapVilles.keySet().iterator();
		while (keysIte.hasNext()) {
			int cle = keysIte.next();
			String courant = mapVilles.get(cle);
			System.out.println(cle + " -> " + courant);
		}
		
		// On affiche l'ensemble des valeurs contenues dans la map
		System.out.println("");
		Iterator<String> iteratorVille = mapVilles.values().iterator();
		while (iteratorVille.hasNext()) {
			String courant = iteratorVille.next();
			System.out.println(courant);
		}
		
		// On affiche la taille de la map
		System.out.println("");
		System.out.println("Taille de la map: " + mapVilles.size());

	}

}
