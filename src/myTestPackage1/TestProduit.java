package myTestPackage1;

public class TestProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produit P1 = new Produit("Lait",3.5f);
		Produit P2 = new Produit("carrot",7.5f);
		
//		P1.details();
		P1.afficherCompteur();
		Produit.afficherCompteur();
		System.out.println(Produit.Compteur);
		System.out.println(P1.Compteur);

	}

}
