package fr.diginamic.salaire;

/**
 * 
 * Représente un indépendant intervenant au sein du journal pour une courte durée, parfois une seule journée
 * 
 * @author xavie
 *
 */
public class Pigiste extends Intervenant {
	
	/** nombre de jours travaillés pour la société durant le mois */
	private int nbJoursTrav;
	/** montant journalier de rémunération */
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
