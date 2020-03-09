package listes;

import java.util.List;
import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		// On stocke tous les nombres de 1 à 100 dans la liste
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		// On affiche la taille de la liste
		System.out.println(list.size());

	}

}
