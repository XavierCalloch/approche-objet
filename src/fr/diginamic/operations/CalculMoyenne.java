package fr.diginamic.operations;

/**
 * 
 * Classe utilitaire servant à calculer une moyenne de nombres de type double
 * 
 * @author xavie
 *
 */
public class CalculMoyenne {
	
	/** tableau de nombres de type double */
	private double[] tab = new double[0];
	
	/** Le constructeur de la classe CalculMoyenne sans paramètres est déjà présent par défaut **/
	
	/**
	 * 
	 * Cette méthode permet d’ajouter un nombre de type double au tableau
	 * 
	 * @param d
	 */
	public void ajout(double d) {
		// On va devoir créer un tableau temporaire plus grand d'une case que le tableau précédent
		double[] tmp = new double[tab.length + 1];
		
		// On stocke toutes les valeurs du tableau précédent dans le nouveau tableau
		for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
			tmp[i] = tab[i];
		}
		
		// Puis en fin de tableau (case complémentaire), on stocke la valeur saisie
		tmp[tmp.length - 1] = d;
		
		// On affecte enfin le tableau tmp au tableau tab
		tab = tmp;
	}
	
	/**
	 * 
	 * Cette méthode calcule et retourne la moyenne des éléments du tableau
	 * 
	 * @return la moyenne des éléments du tableau
	 */
	public double calcul() {
		double moy = 0.0;
		double somme = 0.0;
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		moy = somme / tab.length;
		return moy;
	}
	
}
