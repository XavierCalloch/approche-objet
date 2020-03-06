package fr.diginamic.salaire;

/**
 * 
 * Représente le concept d'intervenant (une personne qui travaille pour la société)
 * 
 * @author xavie
 *
 */
public abstract class Intervenant {
	/** nom de l'intervenant */
	private String nom;
	/** prenom de l'intervenant */
	private String prenom;
	
	/**
	 * 
	 * Cette méthode retourne le salaire de l'intervenant
	 * 
	 * @return le salaire de l'intervenant
	 */
	public abstract double getSalaire();
	
	/**
	 * 
	 * Cette méthode retourne le statut de l'intervenant
	 * 
	 * @return le statut de l'intervenant
	 */
	public abstract String afficherStatut();
	
	/**
	 * 
	 * Cette méthode affiche toutes les données concernant l'intervenant
	 * 
	 * @return toutes les données concernant l'intervenant
	 */
	public String afficherDonnees() {
		return "Nom: " + nom + "\nPrénom: " + prenom + "\nSalaire: " + getSalaire() + "\nStatut: " + afficherStatut();
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/** Setter
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
