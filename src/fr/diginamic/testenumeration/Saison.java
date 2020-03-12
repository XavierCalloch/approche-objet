package fr.diginamic.testenumeration;

/**
 * 
 * Représente les saisons
 * 
 * @author xavie
 *
 */
public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Eté", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	/** libellé de la saison */
	private String libelle;
	
	/** numéro d'ordre */
	private int numeroOrdre;
	
	/** Constructeur
	 * @param libelle libellé de la saison
	 */
	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}
	
	/** Méthode qui retourne une instance de Saison en fonction du libellé
	 * @param libelle libellé de la saison
	 * @return Saison
	 */
	public static Saison getInstanceSaison(String libelle) {
		for (Saison s : Saison.values()) {
			if (s.name().equalsIgnoreCase(libelle)) {
				return s;
			}
		}
		return null;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the numeroOrdre
	 */
	public int getNumeroOrdre() {
		return numeroOrdre;
	}

	/** Setter
	 * @param numeroOrdre the numeroOrdre to set
	 */
	public void setNumeroOrdre(int numeroOrdre) {
		this.numeroOrdre = numeroOrdre;
	}
	
}
