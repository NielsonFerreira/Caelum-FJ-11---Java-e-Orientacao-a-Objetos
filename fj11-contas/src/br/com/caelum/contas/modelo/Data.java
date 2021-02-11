package br.com.caelum.contas.modelo;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public boolean verificaAnoBissexto(int ano) {
		boolean anoBissexto = false;
		
		if(ano % 4 == 0) {
			if(ano % 100 != 0) {
				anoBissexto = true;
			}
		}else if(ano % 400 == 0) {
			anoBissexto = true;
		} else {
			anoBissexto = false;
		}

		return anoBissexto;
	}
	
	public boolean validaData(int dia, int mes, int ano) {
		if(dia > 31 || dia < 1) {
			return false;
		}
		if(mes > 12 || mes < 1) {
			return false;
		}
		
		if(((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && (dia > 30)) {
			return false;
		}
		
		if(verificaAnoBissexto(ano) == true) {
			if((mes == 2) && (dia > 29 || dia < 1)){
				return false;
			} else {
				return true;
			}
		} else {
			if((mes == 2) && (dia > 28 || dia < 1)) {
				return false;
			} else {
				return true;
			}
		}
	}
	
	public String formatada() {
		
		if(validaData(this.dia, this.mes, this.ano) == true) {
			String dataFormatada = this.dia + "/" + this.mes + "/" + this.ano;
			return dataFormatada;
		} else {
			return ("Data Inválida"); 
		}
	}
}
