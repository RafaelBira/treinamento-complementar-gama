
public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;

	public Relogio(int hora, int minuto, int segundo) {
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora > 23 || hora < 0)
			hora = 23;
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto > 59 || minuto < 0)
			minuto = 59;
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo > 59 || segundo < 0)
			segundo = 59;
		this.segundo = segundo;
	}

	public void mostrarHorario() {
		System.out.println("hor�rio atual: " + hora + ":" + minuto + ":" + segundo);
	}

}
