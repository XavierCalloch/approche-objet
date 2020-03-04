package fr.diginamic.banque.entites;

/**
 * Repr�sente le concept de Compte
 * 
 * @author xavie
 *
 */
public class Compte {
	/** num�ro du compte */
	private String numero;
	/** solde du compte */
	private double solde;
	
	/**
	 * 
	 * Constructeur
	 * 
	 * @param numero	num�ro de compte
	 * @param solde		solde du compte
	 */
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return("Num�ro: " + numero + " - Solde: " + Double.toString(solde));
	}
	/*
	 * Correction:
	 * return (numero + "\n" + Double.toString(solde));
	 */
	

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
