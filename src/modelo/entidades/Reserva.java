package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Reserva {

	 private Integer numQuarto;
	 private Date checkIn;
	 private Date checkOut;
	 
	 // define um formato dia/mes/ano   -, o dado foi colocado como statico
	 // para nao precisar  instanciar outro simpledateformat para cada redefinicao de reserva
	 
	 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numQuarto, Date checkIn, Date checkOut) {
		this.numQuarto = numQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
		

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	
	public Date getCheckOut() {
		return checkOut;
	}
	 // OS gets de data foram excluidos porque foi definido um metodo para atualizar as datas 

	// esta usando o tipo long porque a diferenca entre duas datas retorna como o tipo long
	
	public long duracao() {
		// usando o getTime ele gera a diferenca entre as duas datas em milessegundos  
		long diff = checkOut.getTime() - checkIn.getTime();
		//converte os milessegundos em dias 
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	
	}
	
	public void AtualizaDatas(Date checkIn, Date checkOut) {
		this.checkIn = checkIn; 
		this.checkOut = checkOut;
		
	}
	 
	@Override
	public String toString() {
		return "Quarto "
				+ numQuarto 
		        + ", check-in: "
		        +sdf.format(checkIn)
		        + ", check-out: "
		        +sdf.format(checkOut)
		        + " , "
		        + duracao()
		        + " noites;";
		        
	}
	 
}