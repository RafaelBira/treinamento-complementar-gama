import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioBruto, prestacao, valorLimite;

		System.out.println("digite o valor do salário bruto");
		salarioBruto = teclado.nextDouble();

		System.out.println("digite o valor da prestação");
		prestacao = teclado.nextDouble();
		valorLimite = salarioBruto * 0.3;

		if (prestacao > valorLimite) {
			System.out.println("crédito negado");
		} else {
			System.out.println("crédito aprovado");
		}

	}
}
