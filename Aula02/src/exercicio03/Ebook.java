package exercicio03;

public class Ebook {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual = 1;

	public Ebook(String titulo, String autor, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public void avançarPagina(int quantas) {
		if (paginaAtual < totalPaginas) {
			paginaAtual += quantas;
		}
	}

	public void voltarPagina(int quantas) {
		if (paginaAtual > 1) {
			paginaAtual -= quantas;
		}
	}

	public void irParaPagina(int paginaInformada) {
		if (paginaInformada > 0 && paginaInformada < totalPaginas) {
			paginaAtual = paginaInformada;
		}
	}

	public void mostrarPaginaAtual() {
		System.out.println("você está na página " + paginaAtual);
	}

	public void mostrarInfos() {
		System.out.println("título: " + titulo + "\r\nautor: " + autor + "\r\ntotal de páginas: " + totalPaginas);
	}

}
