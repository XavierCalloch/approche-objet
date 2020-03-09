package listes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Représente une ville
 * 
 * @author xavie
 *
 */
public class Ville {
	
	/** nom de la ville */
	private String nom;
	
	/** nombre d'habitants */
	private int nbHabitants;
	
	/** Constructeur
	 * @param nom nom de la ville
	 * @param nbHabitants nombre d'habitants
	 */
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	public static void main(String[] args) {
		
		List<Ville> liste = new ArrayList<>();
		liste.addAll(Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400), new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200), new Ville("Marseille", 850700), new Ville("Tarbes", 40600)));
		
		// On recherche et affiche la ville la plus peuplée
		Ville villeLaPlusPeuplee = liste.get(0); // ville la plus peuplée, initialisée au premier élément de la liste
		
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() > villeLaPlusPeuplee.getNbHabitants()) {
				villeLaPlusPeuplee = liste.get(i);
			}
		}
		System.out.println(" ");
		System.out.println("Ville la plus peuplée: " + villeLaPlusPeuplee.getNom());
		
		// On supprime la ville la moins peuplée
		Ville villeLaMoinsPeuplee = liste.get(0); // ville la moins peuplée, initialisée au premier élément de la liste
		
		for (int i = 1; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() < villeLaMoinsPeuplee.getNbHabitants()) {
				villeLaMoinsPeuplee = liste.get(i);
			}
		}
		liste.remove(liste.indexOf(villeLaMoinsPeuplee));
		System.out.println(" ");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i).getNom() + " " + liste.get(i).getNbHabitants());
		}
		
		// On modifie les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNbHabitants() > 100000) {
				liste.get(i).setNom(liste.get(i).getNom().toUpperCase());
			}
		}
		System.out.println(" ");
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(liste.get(i).getNom() + " " + liste.get(i).getNbHabitants());
		}

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
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
