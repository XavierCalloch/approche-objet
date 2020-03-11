package tri;

import java.util.Comparator;

import sets.Pays;

/**
 * 
 * Représente un Comparator sur le PIB/hab d'un pays
 * 
 * @author xavie
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {

	// On veut que le tri se fasse sur le PIB/hab
	@Override
	public int compare(Pays pays1, Pays pays2) {
		return (int) (pays1.getPIBParHab() - pays2.getPIBParHab());
	}

}
