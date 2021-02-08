
public class Data {
	int dia;
	int mes;
	int ano;
	
	String formatada() {
		Data data = new Data();
		
		data.dia = 04;
		data.mes = 06;
		data.ano = 2015;
		
		String dataFormatada = data.dia + "/" + data.mes + "/" + data.ano; 
		
		return dataFormatada;
	}
}
