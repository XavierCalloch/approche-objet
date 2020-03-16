package fr.diginamic.recensement;

/**
 * 
 * Représente une ville
 * 
 * @author xavie
 *
 */
public class Ville implements Comparable<Ville> { // 
	
	/** code de la région */
	private String codeRegion;
	
	/** nom de la région */
	private String nomRegion;
	
	/** code du département */
	private String codeDepartement;
	
	/** code de la commune */
	private String codeCommune;
	
	/** nom de la commune */
	private String nomCommune;
	
	/** population totale de la ville */
	private int populationTotale;
	
	/** Constructeur
	 * @param codeRegion		code de la région
	 * @param nomRegion			nom de la région
	 * @param codeDepartement	code du département
	 * @param codeCommune		code de la commune
	 * @param nomCommune		nom de la commune
	 * @param populationTotale	population totale de la ville
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int populationTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	@Override
	public String toString() {
		return "Code région: " + getCodeRegion() + "\nNom région: " + getNomRegion() + "\nCode département: " + getCodeDepartement() + "\nCode commune: " + getCodeCommune() + "\nNom commune: " + getNomCommune() + "\nPopulation totale: " + getPopulationTotale();
	}
	
	
	@Override
    public int compareTo(Ville v) {
        return this.getCodeCommune().compareTo(v.getCodeCommune());
    }
	


	/** Getter
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/** Setter
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/** Getter
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/** Setter
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/** Getter
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
}
