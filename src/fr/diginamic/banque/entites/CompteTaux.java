package fr.diginamic.banque.entites;

/** 
 * Repr�sente un compte r�mun�r� avec taux
 * 
 * @author xavie
 *
 */
public class CompteTaux extends Compte {
	
	/** taux de r�mun�ration */
	private double tauxRemu;
	
	/** Constructeur
	 * @param numero	num�ro de compte
	 * @param solde		solde du compte
	 * @param tauxRemu	taux de r�mun�ration
	 */
	public CompteTaux(String numero, double solde, double tauxRemu) {
		super(numero, solde);
		this.tauxRemu = tauxRemu;
	}
	
	@Override
	public String toString() {
		String numeroEtSolde = super.toString() + "\n"; // String chaine
		return numeroEtSolde + "Taux de r�mun�ration: " + tauxRemu + " %";
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
