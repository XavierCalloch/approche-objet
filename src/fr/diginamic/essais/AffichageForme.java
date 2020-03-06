package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * 
 * Classe AffichageForme, qui peut afficher le périmètre et la surface d'une forme géométrique
 * 
 * @author xavie
 *
 */
public class AffichageForme {

	/**
	 * 
	 * Cette méthode affiche le périmètre de la forme ainsi que sa surface
	 * 
	 * @param forme	une forme géométrique
	 * @return le périmètre et la surface de la forme
	 */
	public String afficher(Forme forme) {
		return "Périmètre: " + forme.calculerPerimetre() + " - Surface: " + forme.calculerSurface();
	}
	
}
