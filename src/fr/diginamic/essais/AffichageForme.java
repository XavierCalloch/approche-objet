package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

/**
 * 
 * Classe AffichageForme, qui peut afficher le p�rim�tre et la surface d'une forme g�om�trique
 * 
 * @author xavie
 *
 */
public class AffichageForme {

	/**
	 * 
	 * Cette m�thode affiche le p�rim�tre de la forme ainsi que sa surface
	 * 
	 * @param forme	une forme g�om�trique
	 * @return le p�rim�tre et la surface de la forme
	 */
	public String afficher(Forme forme) {
		return "P�rim�tre: " + forme.calculerPerimetre() + " - Surface: " + forme.calculerSurface();
	}
	
}
