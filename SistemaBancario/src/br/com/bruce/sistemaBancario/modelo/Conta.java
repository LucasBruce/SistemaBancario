package br.com.bruce.sistemaBancario.modelo;

public class Conta {

	public DadoCliente dadoCliente;
	public Endereco endereco;
	private String agencia;
	private int numeroConta;
	private double saldo;

	public DadoCliente getDadoCliente() {
		return dadoCliente;
	}

	public void setDadoCliente(DadoCliente dadoCliente) {
		this.dadoCliente = dadoCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public void transferir(double valor) {
		this.saldo -= valor;
	}

}
