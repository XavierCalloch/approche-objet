package fr.diginamic.salaire;

/**
 * 
 * Représente un salarié du journal
 * 
 * @author xavie
 *
 */
public class Salarie extends Intervenant {
	
	/** montant du salaire mensuel */
	private double salaire;
	
	@Override
	public String afficherStatut() {
		return "Salarié";
	}

	/** Getter
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/** Setter
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}
