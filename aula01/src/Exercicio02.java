import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioBruto, prestacao, valorLimite;

		System.out.println("digite o valor do sal�rio bruto");
		salarioBruto = teclado.nextDouble();

		System.out.println("digite o valor da presta��o");
		prestacao = teclado.nextDouble();
		valorLimite = salarioBruto * 0.3;

		if (prestacao > valorLimite) {
			System.out.println("cr�dito negado");
		} else {
			System.out.println("cr�dito aprovado");
		}

	}
}
