package maioNUmeroPacote;

import java.util.Scanner;
import java.util.Locale;

public class MaioNumerodeLista {

	public static void main(String[] args) {
		
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Digite o Numero total de valores Inteiros:");
	
	int n= sc.nextInt();
	
	while (n<=0) {
		System.out.println("N precisa ser positivo .Digite Novamente!!");
		System.out.println("Digite o Numero total de valores Inteiros:");
		n= sc.nextInt();			
	}
	int Maior =Integer.MIN_VALUE;
	
	for ( int i = 1; i<=n ; i++) {
		System.out.println("Valor #"+ i +":");
		int x = sc.nextInt();
		if (x > Maior)  {
			 Maior = x; 
		}
	}
	System.out.println("Maior Numero: "+Maior);
	sc.close();
	
    } 
}
