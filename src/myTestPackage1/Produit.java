package myTestPackage1;

public class Produit {
	
	private String nom;
	private float prix;
	
	public static int Compteur = 0;
	
	public Produit(String nom,float prix) 
	{
		this.nom = nom;
		this.prix = prix;
		Compteur ++;
	}
	
	public void details() {
		System.out.println(this.nom + " " + this.prix);
	}
	
	public static void afficherCompteur()
	{
		System.out.println(Compteur);
	}
	

}
