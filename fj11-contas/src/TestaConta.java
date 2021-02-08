
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.titular = "Hugo";
		c1.numero = 123;
		c1.agencia = "45678-9";
		c1.saldo = 50.0;
		Data data = new Data();
		c1.dataDeAbertura = data;
		
		c1.deposita(100.0);
		System.out.println("saldo atual: " + c1.saldo);
		System.out.println("rendimento mensal: " + c1.calculaRendimento());
		
		System.out.println(c1.recuperaDadosParaImpressao());
	}

}
