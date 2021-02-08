
public class Conta {

	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataDeAbertura;

	void saca(double valor) {
		saldo = saldo - valor;
	}
	
	void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	double calculaRendimento() {
		return saldo * 0.1;
	}
	
	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nSaldo: " + this.saldo;
		dados += "\nTitular: " + this.titular;
		dados += "\nAgência: " + this.agencia;
		dados += "\nRendimento: " + this.calculaRendimento();
		dados += "\nData de abertura: " + this.dataDeAbertura.formatada();
		
		return dados;
	}
}
