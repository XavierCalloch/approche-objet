package listes;

import java.util.List;
import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		
		List<Integer> liste = new ArrayList<>();
		
		liste.add(-1); // ou addAll() ou Arrays.asList()
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		// On affiche tous les éléments de la liste
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		System.out.println(" ");
		
		// On affiche la taille de la liste
		System.out.println("Taille de la liste: " + liste.size());
		
		// On recherche et affiche le plus grand élément de la liste
		int max = liste.get(0); // valeur maximale du tableau, initialisée au premier élément de la liste
		
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i) > max) {
				max = liste.get(i);
			}
		}
		System.out.println(" ");
		System.out.println("Plus grand élément de la liste: " + max);
		
		// On supprime le plus petit élément de la liste et on affiche le résultat
		int min = liste.get(0); // valeur minimale du tableau, initialisée au premier élément du tableau
		
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i) < min) {
				min = liste.get(i);
			}
		}
		
		System.out.println(" ");
		liste.remove(liste.indexOf(min));
		/*
		 * Object min = Collections.min(liste1); // obtenir le min
		 * liste1.remove(min); // on enlève le min à la liste
		 * liste2.addAll(liste1); // on ajoute la liste1 sans le min à la liste 2
		 */
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		// On recherche tous les éléments négatifs et on les modifie les de manière à ce qu’ils deviennent positifs
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, Math.abs(liste.get(i))); // liste.replaceAll(i -> Math.abs(i));
			}
		}
		System.out.println(" ");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
	}

}
