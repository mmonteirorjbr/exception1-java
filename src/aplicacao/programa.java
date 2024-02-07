package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.Reserva;

public class programa {

	 public static void main(String[] arqs) throws ParseException  {
		 
		 Scanner sc= new Scanner(System.in);
				 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  
		         System.out.print("Número do Quarto: ");
		         int numero = sc.nextInt();
		         System.out.print("Data do Check-in (dd/MM/yyyy):");
		         Date checkIn = sdf.parse(sc.next());
		         System.out.print("Data do Check-out (dd/MM/yyyy):");
		         Date checkOut = sdf.parse(sc.next());
		         
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
			         
			         //solucao muito  ruim para tratamento de datas passadas
			         
			         Date agora = new Date();
			         //Ses datas foram antes de agora nao aceita
			         if (checkIn.before(agora) || checkOut.before(agora) ) {
			        	 System.out.println("erro na reserva: Datas para Atualizar tem de ser datas futuras ");
			         }
			         else if (!checkOut.after(checkIn)) {
			        	 System.out.println("Erro na reserva: Data do Check-out tem de ser depois da data do Check-in");
			         }
			         else { 	         
			        reserva.AtualizaDatas(checkIn, checkOut);
			         System.out.println("Reserva:" + reserva);
			         } 
		         }
		         sc.close();
		         
	 }
}