package sets;

public class Pays {
	
	private String nom;
	
	private double nbHabitants; // double ou int ?
	
	private double PIBParHab; // double ou int ?
	
	public Pays(String nom, double nbHabitants, double PIBParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.PIBParHab = PIBParHab;
	}
	
	@Override
	public String toString() {
		return "Nom: " + getNom() + "Nombre d'habitants: " + getNbHabitants() + "PIB par habitant: " + getPIBParHab();
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nbHabitants
	 */
	public double getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(double nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/** Getter
	 * @return the pIBParHab
	 */
	public double getPIBParHab() {
		return PIBParHab;
	}

	/** Setter
	 * @param pIBParHab the pIBParHab to set
	 */
	public void setPIBParHab(double pIBParHab) {
		PIBParHab = pIBParHab;
	}
	
}
