package fr.diginamic.interfaces;

public class Cercle implements ObjetGeometrique {
	
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double perimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}
	
	public double surface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}
	
}
