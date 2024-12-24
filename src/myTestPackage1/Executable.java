package myTestPackage1;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte C1 = new Compte(1,200.45);
		Compte C2 = new Compte(2,160.34);
		
		Cercle Cercle1 = new Cercle(22.5,"Rouge");
//		System.out.println(Cercle1.surface());
		
		Rectangle R1 = new Rectangle();
//		System.out.println(R1.perimetre());
		
		Point P1 = new Point(2,6);
		Point P2 = new Point(2,6);
		
//		System.out.println(P1.equals(P2));
		
		Calcul A1 = new Calcul();
		System.out.println(A1.addition(2, 3));
		
	}

}
