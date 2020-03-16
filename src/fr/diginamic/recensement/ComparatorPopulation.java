package fr.diginamic.recensement;

import fr.diginamic.recensement.Ville;

import java.util.Comparator;

/** Représente un Comparator sur la population totale d'une ville
 * @author xavie
 *
 */
public class ComparatorPopulation implements Comparator<Ville> {
	
	@Override
	public int compare(Ville ville1, Ville ville2) {
		return (int) (ville1.getPopulationTotale() - ville2.getPopulationTotale());
	}
	
}
