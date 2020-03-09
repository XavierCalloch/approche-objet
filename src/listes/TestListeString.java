package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {

	public static void main(String[] args) {
		
		List<String> liste = new ArrayList<>();
		liste.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		// On recherche la ville dans cette liste qui a le plus grand nombre de lettres
		String nomLePlusLong = liste.get(0); // initialisation du nom de la ville qui a le plus grand nombre de lettres à l'élément d'index 0
		
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).length() > nomLePlusLong.length()) {
				nomLePlusLong = liste.get(i);
			}
		}
		System.out.println("Ville qui a le plus grand nombre de lettres: " + nomLePlusLong);
		
		// On met tous les noms de villes en majuscules
		System.out.println(" ");
		for (int i = 0; i < liste.size(); i++) {
			liste.set(i, liste.get(i).toUpperCase());
			System.out.println(liste.get(i));
		}
		
		// On supprime de la liste les villes dont le nom commence par la lettre N
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}
		System.out.println(" ");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}

	}

}
