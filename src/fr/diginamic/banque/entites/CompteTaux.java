package fr.diginamic.banque.entites;

/** 
 * Représente un compte rémunéré avec taux
 * 
 * @author xavie
 *
 */
public class CompteTaux extends Compte {
	
	/** taux de rémunération */
	private double tauxRemu;
	
	/** Constructeur
	 * @param numero	numéro de compte
	 * @param solde		solde du compte
	 * @param tauxRemu	taux de rémunération
	 */
	public CompteTaux(String numero, double solde, double tauxRemu) {
		super(numero, solde);
		this.tauxRemu = tauxRemu;
	}
	
	@Override
	public String toString() {
		String numeroEtSolde = super.toString() + "\n"; // String chaine
		return numeroEtSolde + "Taux de rémunération: " + tauxRemu + " %";
	}

	/** Getter
	 * @return the tauxRemu
	 */
	public double getTauxRemu() {
		return tauxRemu;
	}

	/** Setter
	 * @param tauxRemu the tauxRemu to set
	 */
	public void setTauxRemu(double tauxRemu) {
		this.tauxRemu = tauxRemu;
	}
}
