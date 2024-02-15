package modelo.excecoes;

//public class DomainException extends Exception {
// mudou de exception para RuntimeException de forma a nao precisar tratar 
// dentro do modulo. Ai ele tirou o "throws exception" do programa

	public class DomainException extends RuntimeException {
	
	/**
	 * a classe exception precisa ser serializada entao e colocado
	 * a versao 1  
	 */
	private static final long serialVersionUID = 1L;

	 // Cria um construtor que apenas encaminha a mensagem para a classe superior.
	 public DomainException(String msg) {
	    super(msg);
}
	
}
