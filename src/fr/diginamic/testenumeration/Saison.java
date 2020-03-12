package fr.diginamic.testenumeration;

/**
 * 
 * Repr�sente les saisons
 * 
 * @author xavie
 *
 */
public enum Saison {
	
	PRINTEMPS("Printemps", 1),
	ETE("Et�", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	/** libell� de la saison */
	private String libelle;
	
	/** num�ro d'ordre */
	private int numeroOrdre;
	
	/** Constructeur
	 * @param libelle libell� de la saison
	 */
	private Saison(String libelle, int numeroOrdre) {
		this.libelle = libelle;
		this.numeroOrdre = numeroOrdre;
	}
	
	/** M�thode qui retourne une instance de Saison en fonction du libell�
	 * @param libelle libell� de la saison
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
