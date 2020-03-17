package fr.diginamic.maison;

import fr.diginamic.maison.Piece;
import java.util.Scanner;

/**
 * 
 * Repr�sente une maison
 * 
 * @author xavie
 *
 */
public class Maison {
	
	/** tableau des pi�ces de la maison */
	private Piece[] pieces = new Piece[0];
	
	/**
	 * 
	 * Cette m�thode permet d�ajouter une pi�ce � la maison
	 * 
	 * @param piece la nouvelle pi�ce � rajouter
	 */
	public void ajouterPiece(Piece piece) throws Exception {
//		if (piece == null || piece.getSuperficie() < 0) { // s'il n'y a pas de pi�ce de renseign�e ou que la superficie de la pi�ce est n�gative
//			//System.out.println("Veuillez ajouter une pi�ce au tableau");
//			throw new Exception("Veuillez ajouter une pi�ce dont la superficie est positive et non nulle");
//		}
		if (piece == null) { // s'il n'y a pas de pi�ce de renseign�e
			throw new Exception("Veuillez ajouter une pi�ce non nulle");
		}
		else if (piece.getSuperficie() < 0) {// si la superficie d'une pi�ce est n�gative
			throw new Exception("Veuillez ajouter une pi�ce dont la superficie est positive et non nulle");
		}
		else if (piece.getEtage() < 0) { // si le num�ro de l'�tage d'une pi�ce est n�gatif
			System.out.println("Veuillez ajouter une pi�ce avec une superficie ou un �tage non n�gatif");
		}
		else {
			// On va devoir cr�er un tableau temporaire plus grand d'une case que le tableau pr�c�dent
			Piece[] tmp = new Piece[pieces.length + 1];
								
			// On stocke toutes les valeurs du tableau pr�c�dent dans le nouveau tableau
			for (int i = 0; i < tmp.length - 1 && pieces.length > 0; i++) {
				tmp[i] = pieces[i];
			}
								
			// Puis en fin de tableau (case compl�mentaire), on stocke la valeur saisie
			tmp[tmp.length - 1] = piece;
								
			// On affecte enfin le tableau tmp au tableau pieces
			pieces = tmp;
		}
	}
	
	/**
	 * 
	 * Cette m�thode retourne la superficie totale de la maison
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
	 * Cette m�thode retourne la superficie d�un �tage donn�
	 * 
	 * @param etage un �tage donn�
	 * @return la superficie de cet �tage
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
		
		// Cr�ation de la variable saisie de type Scanner
		Scanner saisie = new Scanner(System.in);
		
		// On affiche les options du programme � l'utilisateur
		System.out.println("Veuillez saisir le num�ro correspondant au type de pi�ce souhait�:");
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
