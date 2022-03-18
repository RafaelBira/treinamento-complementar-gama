package exercicio01;

public class Funcionario {
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHoraTrabalhada;

	public Funcionario(String nome, int horasTrabalhadas, double valorPorHoraTrabalhada) {
		this.nome = nome;
		setHorasTrabalhadas(horasTrabalhadas);
		setValorPorHoraTrabalhada(valorPorHoraTrabalhada);
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		if (horasTrabalhadas > 0) {
			this.horasTrabalhadas = horasTrabalhadas;
		}
	}

	public double getValorPorHoraTrabalhada() {
		return valorPorHoraTrabalhada;
	}

	public void setValorPorHoraTrabalhada(double valorPorHoraTrabalhada) {
		if (valorPorHoraTrabalhada > 0) {
			this.valorPorHoraTrabalhada = valorPorHoraTrabalhada;
		}
	}

	public double caucularSalario() {
		return valorPorHoraTrabalhada * horasTrabalhadas;
	}

	public String mostrarDados() {
		return "nome: " + nome + "\r\nhoras trabalhadas: " + horasTrabalhadas + "\r\nvalor por hora trabalhada: "
				+ valorPorHoraTrabalhada;
	}

}
