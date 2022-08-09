package bank;

//Class = Conta
//atributos = número, titular, saldo.
//métodos = minhaConta
//minhaConta = new Conta(); construtor de objeto

public class Conta {
		int numero;
		String titular;
		double saldo;
	}
	class programa{
		public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.titular	=	"Pedro";
		minhaConta.saldo	=	1000.0;
		System.out.println(minhaConta.titular + ", seu saldo atual:	"+minhaConta.saldo + " reais.");
		
		Conta minhaConta2 = new Conta();
		minhaConta2.titular	=	"Davi";
		minhaConta2.saldo	=	2000.0;
		System.out.println(minhaConta2.titular + ", seu saldo atual: "+minhaConta2.saldo + " reais.");
		
		Conta minhaConta3 = new Conta();
		minhaConta3.titular	=	"Rafael";
		minhaConta3.saldo	=	3000.0;
		System.out.println(minhaConta3.titular + ", seu saldo atual: "+minhaConta3.saldo + " reais.");
		}
		
	}