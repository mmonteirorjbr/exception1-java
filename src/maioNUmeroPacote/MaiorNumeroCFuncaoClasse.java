/**
 * 
 */
package maioNUmeroPacote;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 */
public class MaiorNumeroCFuncaoClasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 numeros separados por espaço:");

		int Num1 = sc.nextInt();
		int Num2 = sc.nextInt();
		int Num3 = sc.nextInt();

		int maior = max(Num1, Num2, Num3);
		showResult(maior);

		sc.close();
	}

	public static int max(int PNum1, int PNum2, int PNum3) {
		int aux;

		if (PNum1 > PNum2 && PNum1 > PNum3) {
			aux = PNum1;
		} else if (PNum2 > PNum3) {
			aux = PNum2;
		} else {
			aux = PNum3;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
}
