package sets;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<>(Arrays.asList(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		
		// On affiche tous les éléments de la collection
		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
			double myDouble = iterator.next();
			System.out.println(myDouble);
		}
		
		// On recherche le plus grand élément de la collection
		Iterator<Double> iterator2 = set.iterator();
		double max = iterator2.next(); // valeur maximale de la collection, initialisée au premier élément de la collection
		
		while (iterator2.hasNext()) {
			double currentMax = iterator2.next();
			if (currentMax > max) {
				max = currentMax;
			}
		}
		System.out.println("");
		System.out.println("Le plus grand élément de la collection est: " + max);
		System.out.println("");
		
		// On supprime le plus petit élément de la collection
		Iterator<Double> iterator3 = set.iterator();
		double min = iterator3.next(); // valeur minimale de la collection, initialisée au premier élément de la collection
		
		while (iterator3.hasNext()) {
			double currentMin = iterator3.next();
			if (currentMin < min) {
				min = currentMin;
			}
		}
		set.remove(min);
		
		// On affiche enfin le contenu de la collection ainsi modifiée
		System.out.println("");
		Iterator<Double> iterator4 = set.iterator();
		while (iterator4.hasNext()) {
			double myDouble = iterator4.next();
			System.out.println(myDouble);
		}

	}

}
