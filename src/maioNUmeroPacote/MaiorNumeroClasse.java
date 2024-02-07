/**
 * 
 */
package maioNUmeroPacote;



import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class MaiorNumeroClasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros separados por espaço:");
		
	    int Num1= sc.nextInt();
		int Num2= sc.nextInt();
		int Num3= sc.nextInt();
			
		if (Num1 >Num2 && Num1> Num3) {
			System.out.println("Maior:" + Num1);
		}
		else if (Num2> Num3) {
			System.out.println("Maior:" + Num2);
		}	
		else {
			System.out.println("Maior:" + Num3);
				
		}
	    	sc.close();
	}

}
