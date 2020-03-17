package fr.diginamic.maison;

import fr.diginamic.maison.Piece;
import java.util.Scanner;

/**
 * 
 * Représente une maison
 * 
 * @author xavie
 *
 */
public class Maison {
	
	/** tableau des pièces de la maison */
	private Piece[] pieces = new Piece[0];
	
	/**
	 * 
	 * Cette méthode permet d’ajouter une pièce à la maison
	 * 
	 * @param piece la nouvelle pièce à rajouter
	 */
	public void ajouterPiece(Piece piece) throws Exception {
//		if (piece == null || piece.getSuperficie() < 0) { // s'il n'y a pas de pièce de renseignée ou que la superficie de la pièce est négative
//			//System.out.println("Veuillez ajouter une pièce au tableau");
//			throw new Exception("Veuillez ajouter une pièce dont la superficie est positive et non nulle");
//		}
		if (piece == null) { // s'il n'y a pas de pièce de renseignée
			throw new Exception("Veuillez ajouter une pièce non nulle");
		}
		else if (piece.getSuperficie() < 0) {// si la superficie d'une pièce est négative
			throw new Exception("Veuillez ajouter une pièce dont la superficie est positive et non nulle");
		}
		else if (piece.getEtage() < 0) { // si le numéro de l'étage d'une pièce est négatif
			System.out.println("Veuillez ajouter une pièce avec une superficie ou un étage non négatif");
		}
		else {
			// On va devoir créer un tableau temporaire plus grand d'une case que le tableau précédent
			Piece[] tmp = new Piece[pieces.length + 1];
								
			// On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
			for (int i = 0; i < tmp.length - 1 && pieces.length > 0; i++) {
				tmp[i] = pieces[i];
			}
								
			// Puis en fin de tableau (case complémentaire), on stocke la valeur saisie
			tmp[tmp.length - 1] = piece;
								
			// On affecte enfin le tableau tmp au tableau pieces
			pieces = tmp;
		}
	}
	
	/**
	 * 
	 * Cette méthode retourne la superficie totale de la maison
	 * 
	 * @return la superficie totale de la maison
	 */
	public double getSuperficieTotale() {
		double superfTot = 0.0;
		for (int i = 0; i <= pieces.length - 1; i++) {
			superfTot += pieces[i].getSuperficie();
		}
		return superfTot;
	}
	
	/**
	 * 
	 * Cette méthode retourne la superficie d’un étage donné
	 * 
	 * @param etage un étage donné
	 * @return la superficie de cet étage
	 */
	public double getSuperficieEtage(int etage) {
		double superfEtage = 0.0;
		for (int i = 0; i <= pieces.length - 1; i++) {
			if (pieces[i].getEtage() == etage) {
				superfEtage += pieces[i].getSuperficie();
			}
		}
		return superfEtage;
	}

	/** Getter
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}

	/** Setter
	 * @param pieces the pieces to set
	 */
	public void setPieces(Piece[] pieces) {
		this.pieces = pieces;
	}
	
	/*
	public double getSuperficieGlobaleType(int typePiece) {
		double superfGlobType = 0.0;
		
		// Création de la variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
		
		// On affiche les options du programme à l'utilisateur
		System.out.println("Veuillez saisir le numéro correspondant au type de pièce souhaité:");
		System.out.println("1 - Chambre");
		System.out.println("2 - Cuisine");
		System.out.println("3 - Salle de bains");
		System.out.println("4 - Salon");
		System.out.println("5 - WC");
		
		for (int i = 0; i <= pieces.length - 1; i++) {
			if (piece.afficherType() == pieces[i].afficherType()) {
				superfGlobType += pieces[i].getSuperficie();
			}
		}
		return superfGlobType;
	}
	*/
	
}
