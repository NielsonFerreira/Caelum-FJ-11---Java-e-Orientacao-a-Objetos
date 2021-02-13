package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Data;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Data data = new Data(4, 6, 2015);
		int totalDeContas = Conta.getIdentificador();
		
		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.setSaldo(50.0);
		c1.setDataDeAbertura(data);
		
		c1.deposita(100.0);
		System.out.println("saldo atual: " + c1.getSaldo());
		System.out.println("rendimento mensal: " + c1.calculaRendimento());
		
		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println("Total de Contas: " + totalDeContas);
		
	}

}
