package br.com.udf;

public class Contas {
	
	public static void main(String[] args) {
		
		/**
		 * Incluir dados relativos as contas de um cliente
		 */
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setCliente("Pryscilla");
		contaBancaria.setNum_conta(2200);
		contaBancaria.setSaldo(100.00);
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setCliente(contaBancaria.getCliente());
		contaEspecial.setNum_conta(contaBancaria.getNum_conta());
		contaEspecial.setSaldo(contaBancaria.getSaldo());
		contaEspecial.setLimite(200.00);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setCliente(contaBancaria.getCliente());
		contaPoupanca.setNum_conta(contaBancaria.getNum_conta());
		contaPoupanca.setSaldo(contaBancaria.getSaldo());
		contaPoupanca.setDiaRendimento(10);
		
		/**
		 * Sacar um determinado valor 
		 * Escolher saque pois compartilham da mesma conta mas com regras diferentes
		 */
		// Saldo não pode ficar negativo, senão não realiza o débito
		contaBancaria.sacar(15.00);
		System.out.println("Saldo após saque da Conta Bancária: R$ " + contaBancaria.getSaldo());
		
		// Permite saldo negativo até o valor do limite
//		contaEspecial.sacar(300.00);
//		System.out.println("Saldo após saque da Conta Especial: R$ " + contaEspecial.getSaldo());
		
		/**
		 * Depositar determinado valor
		 */
//		contaBancaria.depositar(55.00);
//		System.out.println("Saldo após o depósito: R$ " + contaBancaria.getSaldo());
		
		/**
		 * Novo saldo a partir da taxa de rendimento
		 */
//		contaPoupanca.calcularNovoSaldo(0.5);
//		System.out.println("Saldo após soma da taxa de rendimento: R$ " + contaPoupanca.getSaldo());
		
		/**
		 * Mostrar dados da conta
		 */
		System.out.printf("Nome do titular: %s. Saldo da conta: R$%.2f. Limite da conta: R$%.2f Número da conta: %d. "
				+ "Dia do rendimento: %d.", contaBancaria.getCliente(), contaBancaria.getSaldo(), contaEspecial.getLimite(),
				contaBancaria.getNum_conta(), contaPoupanca.getDiaRendimento());
	}

}
