import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0, numeroAtual;

		do {
			System.out.println("digite um n�mero");
			numeroAtual = teclado.nextInt();
			soma += numeroAtual;
		} while (numeroAtual != 0);
		System.out.println("a soma total dos n�meros digitados � " + soma);

	}

}
