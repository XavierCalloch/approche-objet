package entites;

/**
 * 
 * Représente le concept de Personne
 * 
 * @author xavie
 *
 */
public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/**
	 * @param nom				nom de la personne
	 * @param prenom			prenom de la personne
	 * @param adressePostale	adresse de la personne
	 */
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	// Affiche le nom et le prénom avec le nom de famille en majuscules
	public String afficherNomPrenom() {
		return (prenom + " " + nom.toUpperCase());
	}
	
	// Modifie le nom
	public void modifierNom(String nom) { // ou setNom() (mieux)
		this.nom = nom;
	}
	
	// Modifie le prénom
	public void modifierPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// Modifie l'adresse
	public void modifierAdresse(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
	// Retourne le nom
	public String retournerNom() { // getNom() (mieux)
		return nom;
	}
	
	// Retourne le prénom
	public String retournerPrenom() {
		return prenom;
	}
	
	// Retourne l'adresse
	public AdressePostale retournerAdresse() {
		return adressePostale;
	}
	
	// Correction
	
	/**
	 * Affiche l'identité de la personne
	 */
	public void afficherIdentite() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adressePostale
	 */
	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	/**
	 * @param adressePostale the adressePostale to set
	 */
	public void setAdressePostale(AdressePostale adressePostale) {
		this.adressePostale = adressePostale;
	}
	
}
