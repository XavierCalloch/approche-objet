package sets;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
		
		// On recherche le pays dans cette liste qui a le plus grand nombre de lettres
		Iterator<String> iterator = set.iterator();
		String paysMaxNbLettres = iterator.next();
		while (iterator.hasNext()) {
			String currentMax = iterator.next();
			if (currentMax.length() > paysMaxNbLettres.length()) {
				paysMaxNbLettres = currentMax;
			}
		}
		
		// On supprime ce pays
		set.remove(paysMaxNbLettres);
		
		// On affiche enfin le contenu de la collection ainsi modifiée
		Iterator<String> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			String myString = iterator2.next();
			System.out.println(myString);
		}

	}

}
