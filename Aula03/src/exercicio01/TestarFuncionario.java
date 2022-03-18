package exercicio01;

public class TestarFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario("rafael", 40, 50.0);

		System.out.println(f.caucularSalario());
		System.out.println(f.mostrarDados());

		Senior s = new Senior("francisco", 40, 50, 10);

		System.out.println(s.caucularSalario());
		System.out.println(s.mostrarDados());

	}

}
