package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
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
	public void modifierNom(String nom) {
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
	public String retournerNom() {
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
	
}
