import java.util.Scanner;
public class Pave {
	
	public static void main(String [] arge){
		Scanner scan = new Scanner(System.in);
		System.out.println("hello");
		System.out.println("hauteur");
		long haut= scan.nextLong();
		if (haut<0){
			System.out.println("negatif : rerentrez la valeur ");
			haut= scan.nextLong();
		}
		System.out.println("longueur");
		long longu=scan.nextLong();
		if (longu<0){
			System.out.println("negatif : rerentrez la valeur ");
			longu=scan.nextLong();
		}
		System.out.println("largeur");
		long prof=scan.nextLong();
		if (prof<0){
			System.out.println("negatif : rerentrez la valeur ");
			prof=scan.nextLong();
		}
		
		System.out.println("volume :"+(haut*longu*prof));
		
	}
}
