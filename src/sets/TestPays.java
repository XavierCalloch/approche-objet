package sets;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import sets.Pays;

public class TestPays {

	public static void main(String[] args) {
		
		Set<Pays> set = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d), new Pays("France" , 66.99 , 43551d), new Pays("Allemagne" , 82.79 , 50200d), new Pays("UK" , 66.44 , 43620d), new Pays("Italie" , 60.48 , 37970d) , new Pays("Japon" , 126.8 , 42659d) , new Pays("Chine" , 1_395.380 , 16624d) , new Pays("Russie" , 146.780 , 27900d) , new Pays("Inde" , 1_368.163 , 5174d)));
		// set.addAll(Arrays.asList... et mettre tous les chiffres
		
		// On recherche le pays avec le PIB/habitant le plus important
		Iterator<Pays> iterator = set.iterator();
		Pays paysMaxPIBParHab = iterator.next();
		//double maxPIBParHab = iterator.next().getPIBParHab(); // inutile
		while (iterator.hasNext()) {
			Pays currentMax = iterator.next();
			if (currentMax.getPIBParHab() > paysMaxPIBParHab.getPIBParHab()) { // ou get à chaque fois
				paysMaxPIBParHab = currentMax;
			}
		}
		System.out.println(paysMaxPIBParHab); // rajouter "Pays avec..." + ...
		System.out.println("");
		
		// On recherchez le pays avec le PIB total le plus important
		
		// iterator = set.iterator(); // on regénère -> utile
		Iterator<Pays> iterator2 = set.iterator();
		Pays paysMaxPIBTotal = iterator2.next();
		double maxPIBTotal = iterator2.next().getPIBParHab() * iterator2.next().getNbHabitants(); // long PIBtotal
		while (iterator2.hasNext()) {
			Pays currentMax = iterator2.next();
			if (currentMax.getPIBParHab() * currentMax.getNbHabitants() > maxPIBTotal) {
				paysMaxPIBTotal = currentMax;
			}
		}
		System.out.println(paysMaxPIBTotal);
		System.out.println("");
		
		// On modifie le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		Iterator<Pays> iterator3 = set.iterator();
		Pays paysMinPIBTotal = iterator3.next();
		double minPIBTotal = iterator3.next().getPIBParHab() * iterator3.next().getNbHabitants();
		while (iterator3.hasNext()) {
			Pays currentMin = iterator3.next();
			if (currentMin.getPIBParHab() * currentMin.getNbHabitants() < maxPIBTotal) {
				paysMinPIBTotal = currentMin;
			}
		}
		System.out.println(paysMinPIBTotal.getNom().toUpperCase());
		System.out.println("");
		
		// On supprime le pays dont le PIB total est le plus petit
		set.remove(paysMinPIBTotal);
		
		// On affiche enfin le contenu de la collection ainsi modifiée
		Iterator<Pays> iterator4 = set.iterator();
		while (iterator4.hasNext()) {
			Pays myPays = iterator4.next();
			System.out.println(myPays);
		}
		
		// On vérifie le fonctionnement de la méthode equals de la classe Pays
		System.out.println("");
		Pays pays1 = new Pays("USA", 327.2, 57638d);
		Pays pays2 = new Pays("USA", 327.2, 57638d);
		boolean comparaison = pays1.equals(pays2);
		System.out.println(comparaison);

	}

}
