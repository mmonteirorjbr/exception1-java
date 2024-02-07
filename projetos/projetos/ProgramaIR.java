package projetos;



	import java.util.Locale;
    import java.util.Scanner;
    



	public class ProgramaIR {		

			public static void main(String[] args) {

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
	           	
				CalculoIR calculoIR = new CalculoIR();
				
				System.out.println("Nome Funcionario:");
				calculoIR.Nome = sc.nextLine();
				
				System.out.println("Salario Bruto:");
				calculoIR.Salario = sc.nextInt();

				System.out.println("Taxa do IR(%):");
				calculoIR.TaxaIR = sc.nextInt();
				
				calculoIR.CalcSalLiq();
				System.out.println();
				System.out.println("Salario Liquido:," + String.format("%.2f", calculoIR.Salario ));
				
				System.out.println();
				System.out.println("Qual o Percentual de Aumento?");
				calculoIR.PercAumento = sc.nextInt();
                
				calculoIR.CalcAumentoSal();
				System.out.println();
				System.out.println("Salario Atualizado do Funcionario: "+ calculoIR.Nome + ", R$"+ calculoIR.Salario) ;
				
                sc.close();
			} 
}