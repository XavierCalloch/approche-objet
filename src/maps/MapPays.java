package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		
		// On créé une map permettant de stocker les instances de pays (valeur) en fonction de leur nom (clé)
		HashMap<String, Pays> mapPays = new HashMap<String, Pays>();
		
		mapPays.put("USA", new Pays("USA", 327.2, 57638d));
		mapPays.put("France", new Pays("France" , 66.99 , 43551d));
		mapPays.put("Allemagne", new Pays("Allemagne" , 82.79 , 50200d));
		mapPays.put("UK", new Pays("UK" , 66.44 , 43620d));
		mapPays.put("Italie", new Pays("Italie" , 60.48 , 37970d));
		mapPays.put("Japon", new Pays("Japon" , 126.8 , 42659d));
		mapPays.put("Chine", new Pays("Chine" , 1_395.380 , 16624d));
		mapPays.put("Russie", new Pays("Russie" , 146.780 , 27900d));
		mapPays.put("Inde", new Pays("Inde" , 1_368.163 , 5174d));
		
		// On recherche et supprime le pays qui a le moins d’habitants
		Iterator<String> keysIte = mapPays.keySet().iterator();
		String cleMoinsHab = keysIte.next();
		Pays paysMoinsHab = mapPays.get(cleMoinsHab);
		while (keysIte.hasNext()) {
			String cle = keysIte.next();
			Pays current = mapPays.get(cle);
			if (current.getNbHabitants() < paysMoinsHab.getNbHabitants()) {
				paysMoinsHab = current;
			}
		}
		mapPays.remove(paysMoinsHab.getNom());
		
		// On affiche l’ensemble des pays restants
		for (Pays pays : mapPays.values()) {
			System.out.println(pays);
		}

	}

}
