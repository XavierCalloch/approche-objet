package fr.diginamic.interfaces;

/**
 * 
 * Liste les m�thodes obligatoires que doit poss�der un objet g�om�trique
 * 
 * @author xavie
 *
 */
public interface ObjetGeometrique {
	
	/**
	 * 
	 * Retourne le p�rim�tre d�une forme g�om�trique
	 * 
	 * @return le p�rim�tre de la forme g�om�trique
	 */
	public double perimetre();
	
	/**
	 * 
	 * Retourne la surface d�une forme g�om�trique
	 * 
	 * @return la surface de la forme g�om�trique
	 */
	public double surface();
	
}
