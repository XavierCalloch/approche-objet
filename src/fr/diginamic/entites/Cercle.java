package fr.diginamic.entites;

import java.lang.Math.*;

public class Cercle {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	public double calculPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre;
	}
	
	public double calculSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface;
	}

	/** Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
