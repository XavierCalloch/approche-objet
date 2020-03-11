package tri;

import java.util.Comparator;

import sets.Pays;

/**
 * 
 * Représente un Comparator sur le nombre d'habitants d'un pays
 * 
 * @author xavie
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	// On veut que le tri se fasse sur le nombre d’habitants
	@Override
	public int compare(Pays pays1, Pays pays2) {
		return (int) (pays1.getNbHabitants() - pays2.getNbHabitants());
	}

}
