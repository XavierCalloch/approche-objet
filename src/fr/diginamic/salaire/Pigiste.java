package fr.diginamic.salaire;

/**
 * 
 * Repr�sente un ind�pendant intervenant au sein du journal pour une courte dur�e, parfois une seule journ�e
 * 
 * @author xavie
 *
 */
public class Pigiste extends Intervenant {
	
	/** nombre de jours travaill�s pour la soci�t� durant le mois */
	private int nbJoursTrav;
	/** montant journalier de r�mun�ration */
	private double montantJournRemu;
	
	@Override
	public double getSalaire() {
		return montantJournRemu * nbJoursTrav;
	}
	
	@Override
	public String afficherStatut() {
		return "Pigiste";
	}

	/** Getter
	 * @return the nbJoursTrav
	 */
	public int getNbJoursTrav() {
		return nbJoursTrav;
	}

	/** Setter
	 * @param nbJoursTrav the nbJoursTrav to set
	 */
	public void setNbJoursTrav(int nbJoursTrav) {
		this.nbJoursTrav = nbJoursTrav;
	}

	/** Getter
	 * @return the montantJournRemu
	 */
	public double getMontantJournRemu() {
		return montantJournRemu;
	}

	/** Setter
	 * @param montantJournRemu the montantJournRemu to set
	 */
	public void setMontantJournRemu(double montantJournRemu) {
		this.montantJournRemu = montantJournRemu;
	}
	
}
