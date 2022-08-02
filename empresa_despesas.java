package empresa_app;

public class empresa_despesas {
	
	public static void main(String[]args) {
		
		double jan = 15.352 ;  
		double fev = 23.456 ; 
		double mar = 17.221 ;
		
		System.out.println("TABELA DE GASTOS DA EMPRESA:");
		System.out.println("Janeiro: "+jan);
		System.out.println("Fevereiro: "+fev);
		System.out.println("Março: "+mar);
		
		double media = (jan + fev + mar)/3;
		
		System.out.print("Média de despesas:"+media);
	
	}
}

//Na empresa em que trabalhamos, há tabelas com	 
//o gasto de cada mês Para fechar o balanço do
//primeiro trimestre, precisamos somar o gasto	total Sabendo que,	
//em janeiro, foram gastos 15,352 mil
//reais, em fevereiro, 23,456 mil reais e, em março,	
//17,221 mil reais, faça um programa que calcule e imprima
//a despesa total no trimestre e a média mensal de gastos.
