package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.Reserva;
import modelo.excecoes.DomainException;

public class programa {

	 public static void main(String[] arqs) throws DomainException   {
		 // Essa e a solucao muito ruim porque o tratamento das datas tinha de estar dentro da reserva
		 // ou seja, o tratamento esta no programa principal e nao no modulo
		 Scanner sc= new Scanner(System.in);
				 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		         try {
			        	 
			         System.out.print("Número do Quarto: ");
			         int numero = sc.nextInt();
			         System.out.print("Data do Check-in (dd/MM/yyyy):");
			         Date checkIn = sdf.parse(sc.next());
			         System.out.print("Data do Check-out (dd/MM/yyyy):");
			         Date checkOut = sdf.parse(sc.next());
			         
		        	 Reserva reserva = new Reserva(numero, checkIn,checkOut );
		        	 System.out.println("Reserva:"+ reserva);
		        	 
		        	 // Em seguida ele pede para atualizar a reserva
		        	 System.out.println();
		        	 System.out.println("Entre com os dados para autalizar a reserva:");
		        	 System.out.print("Data do Check-in (dd/MM/yyyy):");
			         checkIn = sdf.parse(sc.next());
			         System.out.print("Data do Check-out (dd/MM/yyyy):");
			         checkOut = sdf.parse(sc.next());
			         
			         reserva.AtualizaDatas(checkIn, checkOut);
			         
			       	 System.out.println("Reserva:" + reserva);
			         }
		         catch(ParseException e) {
			         System.out.println("Formato de Data Invalido");
		         }
		        catch( DomainException e) { 
		        	// Esse catch pega os erros do preenchimento que sao controlados na reserva
		        	//e aqui lista as mensagens de erro definidas la
		        }		        
		        catch( RuntimeException e) { 
			        	// 
		        	System.out.println("Erro Inesperado");
		        
		        }
		         sc.close();
		         
	 }
}