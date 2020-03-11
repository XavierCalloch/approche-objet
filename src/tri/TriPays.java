package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import sets.Pays;

public class TriPays {

	public static void main(String[] args) {

		List<Pays> pays = new ArrayList<>();
		pays.addAll(Arrays.asList(new Pays("USA", 327.2, 57638d), new Pays("France", 66.99, 43551d),
				new Pays("Allemagne", 82.79, 50200d), new Pays("UK", 66.44, 43620d), new Pays("Italie", 60.48, 37970d),
				new Pays("Japon", 126.8, 42659d), new Pays("Chine", 1_395.380, 16624d),
				new Pays("Russie", 146.780, 27900d), new Pays("Inde", 1_368.163, 5174d)));
		// ou pays.add()... plutôt

		// On trie la liste
		Collections.sort(pays);

		// On affiche le résultat
		Iterator<Pays> iterator = pays.iterator();
		while (iterator.hasNext()) {
			Pays myPays = iterator.next();
			System.out.println(myPays);
		}

		// On fait un tri sur le nombre d’habitants avec le premier comparator
		Collections.sort(pays, new ComparatorHabitant());

		// On affiche le résultat
		System.out.println("");
		iterator = pays.iterator();
		while (iterator.hasNext()) {
			Pays myPays = iterator.next();
			System.out.println(myPays);
		}

		// On fait un tri sur le PIB/hab avec le second comparator
		Collections.sort(pays, new ComparatorPibHabitant());

		// On affiche le résultat
		System.out.println("");
		iterator = pays.iterator();
		while (iterator.hasNext()) {
			Pays myPays = iterator.next();
			System.out.println(myPays);
		}

	}

}
