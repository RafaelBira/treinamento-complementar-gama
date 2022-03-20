import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite a primeira nota");
		double nota1 = teclado.nextDouble();

		System.out.println("digite a segunda nota");
		double nota2 = teclado.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("a nota média é " + media);
	}

}
