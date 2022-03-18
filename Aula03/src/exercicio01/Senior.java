package exercicio01;

public class Senior extends Funcionario {
	private double bonus;

	public Senior(String nome, int horasTrabalhadas, double valorPorHoraTrabalhada, double bonus) {
		super(nome, horasTrabalhadas, valorPorHoraTrabalhada);
		this.bonus = bonus;
	}

	@Override
	public double caucularSalario() {
		return super.caucularSalario() + (getHorasTrabalhadas() / 10) * bonus;
	}

	@Override
	public String mostrarDados() {
		return super.mostrarDados() + "\r\nbônus: " + bonus;
	}
}
