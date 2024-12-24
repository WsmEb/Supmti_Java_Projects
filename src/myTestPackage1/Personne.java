package myTestPackage1;

public class Personne {
	
	private int age;
	private String nom;
	private String prenom;
	
	public Personne( int a,String n,String p ) 
	{
		this.age = a;
		this.nom = n;
		this.prenom = p;
	}
	
	public void Affiche() {
		System.out.println("Name : " + this.nom + " , Age : " + this.age + " , Prenom : " +this.prenom  );
	}
	
	
	

}
