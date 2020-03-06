package fr.diginamic.banque.entites;

/**
 * 
 * Repr�sente le concept d'op�ration bancaire
 * 
 * @author xavie
 *
 */
public abstract class Operation {
	/** date de l'op�ration */
	private String date;
	/** montant de l'op�ration */
	private double montant;
	
	/** Constructeur
	 * @param date		date de l'op�ration
	 * @param montant	montant de l'op�ration
	 */
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	/**
	 * 
	 * Cette m�thode retourne le type de l'op�ration
	 * 
	 * @return String
	 */
	public abstract String afficherType();
	
	public String toString() {
		return afficherType() + " - " + date + " " + montant;
	}

	/** Getter
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/** Setter
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}
