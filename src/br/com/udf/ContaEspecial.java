package br.com.udf;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valorSaque) {
		double limite = this.limite * -1;
		double saldo = getSaldo();
		double valorFinal = saldo - valorSaque;
		
		if (valorFinal >= limite) {
			setSaldo(valorFinal);
		}
	}

}
