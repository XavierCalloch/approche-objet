package sets;

import java.text.DecimalFormat;

/**
 * 
 * Représente un pays
 * 
 * @author xavie
 *
 */
public class Pays implements Comparable<Pays> {

	/** nom du pays */
	private String nom;

	/** nombre d'habitants du pays */
	private double nbHabitants; // double ou int ?

	/** PIB par habitant du pays */
	private double PIBParHab; // double ou int ?

	/**
	 * Constructeur
	 * 
	 * @param nom         nom du pays
	 * @param nbHabitants nombre d'habitants du pays
	 * @param PIBParHab   PIB par habitant du pays
	 */
	public Pays(String nom, double nbHabitants, double PIBParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.PIBParHab = PIBParHab;
	}

	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#, ##0");
		// return "Nom: " + getNom() + " - Nombre d'habitants: " + getNbHabitants() + "
		// - PIB par habitant: " + getPIBParHab();
		return "Nom: " + getNom() + " - Nombre d'habitants: " + formatter.format(nbHabitants) + " - PIB par habitant: "
				+ formatter.format(PIBParHab);
	}

	/*
	 * @Override public int compareTo(Pays pays2) { int result =
	 * this.nom.compareTo(pays2.getNom()); return result; }
	 */

	// On veut désormais que le tri se fasse sur le PIB/hab
	@Override
	public int compareTo(Pays pays2) {
		return (int) (getPIBParHab() - pays2.getPIBParHab()); // ou return PIBParHab - pays2.getPIBParHab()
		// on peut mettre - devant pour inverser le sens de tri
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Pays)) {
			return false;
		}
		Pays other = (Pays) object;
		return nom.equals(other.getNom());
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public double getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pIBParHab
	 */
	public double getPIBParHab() {
		return PIBParHab;
	}

	/**
	 * Setter
	 * 
	 * @param pIBParHab the pIBParHab to set
	 */
	public void setPIBParHab(double pIBParHab) {
		PIBParHab = pIBParHab;
	}

}
