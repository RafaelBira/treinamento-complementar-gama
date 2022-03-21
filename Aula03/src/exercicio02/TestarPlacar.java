package exercicio02;

public class TestarPlacar {
	public static void main(String[] args) {

		Placar p1 = new Placar();
		Placar p2 = new Placar("internacional", "grêmio");
		Placar p3 = new Placar("internacional", "grêmio", 2, 0);

		System.out.println(p1.mostrarPlacar());
		System.out.println(p2.mostrarPlacar());
		System.out.println(p3.mostrarPlacar());

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
