package fr.diginamic.salaire;

/**
 * 
 * Repr�sente le concept d'intervenant (une personne qui travaille pour la soci�t�)
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
	 * Cette m�thode retourne le salaire de l'intervenant
	 * 
	 * @return le salaire de l'intervenant
	 */
	public abstract double getSalaire();
	
	/**
	 * 
	 * Cette m�thode retourne le statut de l'intervenant
	 * 
	 * @return le statut de l'intervenant
	 */
	public abstract String afficherStatut();
	
	/**
	 * 
	 * Cette m�thode affiche toutes les donn�es concernant l'intervenant
	 * 
	 * @return toutes les donn�es concernant l'intervenant
	 */
	public String afficherDonnees() {
		return "Nom: " + nom + "\nPr�nom: " + prenom + "\nSalaire: " + getSalaire() + "\nStatut: " + afficherStatut();
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
