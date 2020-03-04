package fr.diginamic.banque.entites;

public class Compte {
	private String numero;
	private double solde;
	
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return (numero + "\n" + Double.toString(solde));
	}

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
