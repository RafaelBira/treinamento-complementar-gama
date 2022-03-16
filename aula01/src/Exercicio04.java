import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int tabuada;

		System.out.println("digite o número para qual será cauculado a tabuada");
		tabuada = teclado.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + tabuada * i);
		}

	}

}
