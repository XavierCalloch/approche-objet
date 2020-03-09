package fr.diginamic.interfaces;

/**
 * 
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 * 
 * @author xavie
 *
 */
public interface ObjetGeometrique {
	
	/**
	 * 
	 * Retourne le périmètre d’une forme géométrique
	 * 
	 * @return le périmètre de la forme géométrique
	 */
	public double perimetre();
	
	/**
	 * 
	 * Retourne la surface d’une forme géométrique
	 * 
	 * @return la surface de la forme géométrique
	 */
	public double surface();
	
}
