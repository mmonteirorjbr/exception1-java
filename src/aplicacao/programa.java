package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.Reserva;

public class programa {

	 public static void main(String[] arqs) throws ParseException  {
		 // Essa e a solucao muito ruim porque o tratamento das datas tinha de estar dentro da reserva
		 // ou seja, o tratamento esta no programa principal e nao no modulo
		 Scanner sc= new Scanner(System.in);
				 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  
		         System.out.print("Número do Quarto: ");
		         int numero = sc.nextInt();
		         System.out.print("Data do Check-in (dd/MM/yyyy):");
		         Date checkIn = sdf.parse(sc.next());
		         System.out.print("Data do Check-out (dd/MM/yyyy):");
		         Date checkOut = sdf.parse(sc.next());
		         
		         // essa validacao deveria ser tirada daqui tambem, mas ela deveira ir para o contrutor
		         // so que ele nao pode retornar nada entao nao da pra fazer ainda
		         
		         if (!checkOut.after(checkIn)) {
		        	 System.out.println("Erro na reserva: Data do Check-out tem de ser depois da data do Check-in");
		         }
		         else {
		        	 Reserva reserva = new Reserva(numero, checkIn,checkOut );
		        	 System.out.println("Reserva:"+ reserva);
		        	 
		        	 // Em seguida ele pede para atualizar a reserva
		        	 System.out.println();
		        	 System.out.println("Entre com os dados para autalizar a reserva:");
		        	 System.out.print("Data do Check-in (dd/MM/yyyy):");
			         checkIn = sdf.parse(sc.next());
			         System.out.print("Data do Check-out (dd/MM/yyyy):");
			         checkOut = sdf.parse(sc.next());
			     
			       	         
			         String erro =   reserva.AtualizaDatas(checkIn, checkOut);
			         if (erro != null ) {
			        	 System.out.println("Erro na Reserva: " + erro);					       
			         }
			         else {
			         System.out.println("Reserva:" + reserva);
			         }
		         }
		         sc.close();
		         
	 }
}