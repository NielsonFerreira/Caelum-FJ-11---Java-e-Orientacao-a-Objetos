package br.com.caelum.contas.modelo;

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataDeAbertura;
	private static int identificador;

	public Conta() {
		Conta.identificador = Conta.identificador + 1;
	}
	
	public Conta(String titular) {
		this.titular = titular;
		Conta.identificador = Conta.identificador + 1;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getIdentificador() {
		return Conta.identificador;
	}

	public void saca(double valor) {
		saldo = saldo - valor;
	}
	
	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	public double calculaRendimento() {
		return saldo * 0.1;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nN�mero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAg�ncia: " + this.agencia;
		dados += "\nRendimento: " + this.calculaRendimento();
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		
		return dados;
	}
}
