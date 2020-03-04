package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
	/**
	 * @param numeroRue
	 * @param libelleRue
	 * @param codePostal
	 * @param ville
	 */
	public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
}
