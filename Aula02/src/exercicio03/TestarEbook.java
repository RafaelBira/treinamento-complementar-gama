package exercicio03;

public class TestarEbook {

	public static void main(String[] args) {
		Ebook e = new Ebook("a volta dos que não foram", "Rafael Mito Giuliani", 33);

		e.mostrarInfos();

		e.avançarPagina(1);
		e.mostrarPaginaAtual();

		e.voltarPagina(1);
		e.mostrarPaginaAtual();

		e.irParaPagina(25);
		e.mostrarPaginaAtual();
	}

}
