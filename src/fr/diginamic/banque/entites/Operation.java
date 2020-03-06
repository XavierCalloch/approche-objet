package fr.diginamic.banque.entites;

/**
 * 
 * Représente le concept d'opération bancaire
 * 
 * @author xavie
 *
 */
public abstract class Operation {
	/** date de l'opération */
	private String date;
	/** montant de l'opération */
	private double montant;
	
	/** Constructeur
	 * @param date		date de l'opération
	 * @param montant	montant de l'opération
	 */
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}
	
	/**
	 * 
	 * Cette méthode retourne le type de l'opération
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
