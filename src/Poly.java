import java.util.Scanner;
public class Poly {
	
	public static void main(String [] arge){
		Scanner scan = new Scanner(System.in);
		System.out.println("a*x^2+b*x+c");
		System.out.println("entrez le 'a'");
		float a= scan.nextFloat();
		System.out.println("entrez le 'b'");
		float b= scan.nextFloat();
		System.out.println("entrez le 'c'");
		float c= scan.nextFloat();
		
		float del= b*b-4*a*c;
		
		if (del>0){
			System.out.println("solution 1 :"+((-b-del)/(2*a)));
			System.out.println("solution 2 :"+((-b+del)/(2*a)));
		}
		else{
			if (del==0){
				System.out.println("unique solution :"+((-b)/(2*a)));
			}
			else
			{
				System.out.println("solution complexe");
			}
		}
		
		
	}
}
