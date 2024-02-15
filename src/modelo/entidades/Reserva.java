package modelo.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import modelo.excecoes.DomainException;

public class Reserva {

	 private Integer numQuarto;
	 private Date checkIn;
	 private Date checkOut;
	 
	 // define um formato dia/mes/ano   -, o dado foi colocado como statico
	 // para nao precisar  instanciar outro simpledateformat para cada redefinicao de reserva
	 
	 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer numQuarto, Date checkIn, Date checkOut)  {
		// ele informa que o tratamento tem de vir logo no comeco do construtor
		// antes de usar as variaveis
	  	if (!checkOut.after(checkIn)) {
     	   throw new DomainException("Data do Check-out tem de ser depois da data do Check-in");
    	}
    	
	
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
	
	// Aqui o metodo  ao inves de retornar mensagem ele vai virar void de novo
	// e entao trata as excecoes ja com a tabela de erros previstos no java
	
	public void AtualizaDatas(Date checkIn, Date checkOut)  {
	    
        //solucao ruim com o tratamento dentro do codigo e nao no programa principal 
        
        Date agora = new Date();
        //Se as datas foram antes de agora nao aceita
        
        //a mudanca e que ao inves de printar ele retorna o erro. E a seguir ao invés de ter o "else" 
        // ja q ele retorna e para a funcao nao precisa de else , so de outro if
        
        if (checkIn.before(agora) || checkOut.before(agora) ) {
        	// Ao inves do IllegalArgumentException chama o tratamento de excecoes 
       	   throw new DomainException("Datas para Atualizar têm de ser datas futuras ");
        }
        
       	if (!checkOut.after(checkIn)) {
        	   throw new DomainException("Data do Check-out tem de ser depois da data do Check-in");
       	}
       	
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