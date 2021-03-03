package br.com.caelum.contas.modelo;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Nielson Francisco Fernandes Ferreira
*/

public abstract class Conta {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
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
	
	public abstract String getTipo();
	
	public int getNumero() {
		return numero;
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
	
	/**
	* Metodo que incrementa o saldo.
	* @param valor
	*/
	
	public void deposita(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}
	
	public double calculaRendimento() {
		return saldo * 0.1;
	}
	
	@Override
	public String toString() {
		return "[titular=" + titular.toUpperCase() + ", numero=" + this.numero + ", agencia=" + this.agencia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nRendimento: " + this.calculaRendimento();
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		
		return dados;
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
}
