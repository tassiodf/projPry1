package br.com.udf;

public class ContaBancaria {
	
	private String cliente;
	private int num_conta;
	private double saldo;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNum_conta() {
		return num_conta;
	}
	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void sacar(double valorSaque) {
		if (this.saldo > valorSaque) {
			this.saldo = this.saldo - valorSaque;
		}
	}
	
	public void depositar(double valorDeposito) {
		this.saldo = this.saldo + valorDeposito;
	}
	
}
