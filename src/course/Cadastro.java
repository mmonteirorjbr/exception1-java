package course;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 35
		System.out.println("Idade:");
		
		int n1 = sc.nextInt();
		// Bob Brown
		sc.nextLine();
		System.out.println("Nome:");
		
		String name = sc.nextLine();
		System.out.println("Sexo:");
				// F
		char gender = sc.next().charAt(0);
		// b5
		System.out.println("Variavel:");
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		System.out.println("Numero Fracionado:");
		double n2 = sc.nextDouble();
		
		// Maria F 23 1.68
		System.out.println("String com espacos: Nome Sexo Idade Altura :");
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}
}