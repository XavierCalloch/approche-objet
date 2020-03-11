package sets;

import sets.Pays;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestPays {

	public static void main(String[] args) {
		
		Set<Pays> set = new HashSet<>(Arrays.asList(new Pays("USA", 327.2, 57638d), new Pays("France" , 66.99 , 43551d), new Pays("Allemagne" , 82.79 , 50200d), new Pays("UK" , 66.44 , 43620d), new Pays("Italie" , 60.48 , 37970d) , new Pays("Japon" , 126.8 , 42659d) , new Pays("Chine" , 1_395.380 , 16624d) , new Pays("Russie" , 146.780 , 27900d) , new Pays("Inde" , 1_368.163 , 5174d)));
		
		// On recherche le pays avec le PIB/habitant le plus important
		Iterator<Pays> iterator = set.iterator();
		Pays paysMaxPIBParHab = iterator.next();
		double maxPIBParHab = iterator.next().getPIBParHab();
		while (iterator.hasNext()) {
			Pays currentMax = iterator.next();
			if (currentMax.getPIBParHab() > maxPIBParHab) {
				paysMaxPIBParHab = currentMax;
			}
		}
		
		// On recherchez le pays avec le PIB total le plus important
		Iterator<Pays> iterator2 = set.iterator();
		Pays paysMaxPIBTotal = iterator.next();
		double maxPIBTotal = iterator.next().getPIBParHab() * iterator.next().getNbHabitants();
		while (iterator.hasNext()) {
			Pays currentMax = iterator.next();
			if (currentMax.getPIBParHab() * currentMax.getNbHabitants() > maxPIBTotal) {
				paysMaxPIBTotal = currentMax;
			}
		}
		
		// On modifie le contenu du HashSet pour mettre en majuscule le pays qui a le PIB total le plus petit
		Iterator<Pays> iterator3 = set.iterator();
		Pays paysMinPIBTotal = iterator.next();
		double minPIBTotal = iterator.next().getPIBParHab() * iterator.next().getNbHabitants();
		while (iterator.hasNext()) {
			Pays currentMin = iterator.next();
			if (currentMin.getPIBParHab() * currentMin.getNbHabitants() < maxPIBTotal) {
				paysMinPIBTotal = currentMin;
			}
		}
		paysMinPIBTotal.getNom().toUpperCase();
		
		// On supprime le pays dont le PIB total est le plus petit
		set.remove(paysMinPIBTotal);
		
		// On affiche enfin le contenu de la collection ainsi modifiée
		Iterator<Pays> iterator4 = set.iterator();
		while (iterator4.hasNext()) {
			Pays myPays = iterator4.next();
			System.out.println(myPays.toString());
		}

	}

}
