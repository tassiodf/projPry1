package br.com.udf;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	public void calcularNovoSaldo(double taxaRendimento) {
		double saldo  =  getSaldo();
		setSaldo(saldo + taxaRendimento);
	}

}
