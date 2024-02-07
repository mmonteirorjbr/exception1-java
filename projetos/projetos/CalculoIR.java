package projetos;

import java.util.Locale;
import java.util.Scanner;


public class CalculoIR {

	public String Nome;
	public double Salario;
	public double TaxaIR;
	public double PercAumento;
	
   public void  CalcSalLiq() {
	   
	    Salario -= (Salario* (TaxaIR/100));
   }
   
   public void CalcAumentoSal( ) {
	   
	    Salario += (Salario* (PercAumento/100));
   }
   
}
