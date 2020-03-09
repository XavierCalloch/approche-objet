package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique {
	
	private double longueur;
	private double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	public double perimetre() {
		double perimetre = 2 * (longueur + largeur);
		return perimetre;
	}
	
	public double surface() {
		double surface = longueur * largeur;
		return surface;
	}
	
}
