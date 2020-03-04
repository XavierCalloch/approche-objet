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
	
	public abstract String afficherType();

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
