package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaLista {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Random random = new Random();
		
		Conta c1 = new ContaCorrente();
		c1.setTitular("Pedro Martins");
		contas.add(c1);
		
		Conta c2 = new ContaPoupanca();
		c2.setTitular("Paulo Henrique");
		contas.add(c2);
		
		Conta c3 = new ContaCorrente();
		c3.setTitular("Felipe Dias");
		contas.add(c3);
		
		for(int i = 0; i < contas.size(); i++) {
			Conta conta = contas.get(i);
			conta.deposita(random.nextInt(300) + random.nextDouble());
		}
		
		System.out.println(contas);
	}
}