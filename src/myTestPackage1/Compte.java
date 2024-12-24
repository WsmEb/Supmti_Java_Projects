package myTestPackage1;

public class Compte {
	
	private int numero;
	private double solde;
	
	public Compte(int num,double sd) {
		this.solde = sd;
		this.numero = num;
	}
	
	public void deposer(double amount) {
		this.solde += amount; 
	} 
	
	public void retrier(double amount) {
		this.solde -= amount; 
	}
	
	public void afficher( ) {
		System.out.println("Votre Numero est : " + this.numero);
		System.out.println("Votre Solde est : " + this.solde + " dh");
	}
 
}
