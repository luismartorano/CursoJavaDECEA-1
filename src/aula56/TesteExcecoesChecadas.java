package aula56;

/*
 * Exceções checadas
 * */

public class TesteExcecoesChecadas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.sacar(60);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpe, saldo insuficiente.");
		}
		System.out.println("Saldo: " + cc.getSaldo());
		
		try {
			cc.sacar(50); //o banco não pode ter saldo negativo do cliente
		} catch (SaldoInsuficienteException e) {
			System.out.println("Desculpe, saldo insuficiente.");
		} 
		finally {
			System.out.println("Obrigado por utilizar nosso sistema!");
		}
		System.out.println("Saldo agora: " + cc.getSaldo());
		
	}
	
}
