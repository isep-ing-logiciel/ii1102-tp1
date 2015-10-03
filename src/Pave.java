import java.util.Scanner;

public class Pave {
	public static void main(String [] args) {
		double longueur, largeur, hauteur, volume;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quelle longueur?");
		longueur = scan.nextDouble();
		while (longueur<0) {
			System.out.println("Rentrez une valeur positive!");
			longueur = scan.nextDouble(); 
		}
		System.out.println("Quelle largeur?");
		largeur = scan.nextDouble();
		while (largeur<0) {
			System.out.println("Rentrez une valeur positive!");
			largeur = scan.nextDouble(); 
		}
		System.out.println("Quelle hauteur?");
		hauteur = scan.nextDouble();
		while (hauteur<0) {
			System.out.println("Rentrez une valeur positive!");
			hauteur = scan.nextDouble(); 
		}
		volume = longueur*largeur*hauteur;
		System.out.println("Le volume est "+volume);
	}
}
