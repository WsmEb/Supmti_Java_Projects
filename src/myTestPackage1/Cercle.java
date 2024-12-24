package myTestPackage1;

public class Cercle {
	
	private double rayon;
	private String couleur;
	
	public Cercle(double rayon,String couleur) {
		this.rayon = rayon;
		this.couleur = couleur;
	}
	
	public double surface() {
		return Math.PI * rayon * rayon;
	}
	
	public void affiche()
	{
		System.out.println("Rayon: " + this.rayon + ", Couleur: " + this.couleur);
	}
 
}
