package course;

import java.util.Locale;
import java.util.Scanner;

public class SomaImpar {
	

		public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
           		
			System.out.println("1o NUmero:");
			int num1 = sc.nextInt();

			System.out.println("2o NUmero:");
			int num2 = sc.nextInt();
              
			int Inicio = num1 , Fim = num2 ;
			
			if ( num2 < num1){
				Inicio = num2;
				Fim = num1;
			}
			int TotImpar = 0;
            for ( int i = Inicio ; i<=Fim; i++) {
                if (i % 2 != 0 ) 
                	TotImpar+= i;
                }
  			System.out.println("Soma dos Impares no Intervalo:"+ TotImpar);
                
            sc.close();
           
            }
	
		
}
