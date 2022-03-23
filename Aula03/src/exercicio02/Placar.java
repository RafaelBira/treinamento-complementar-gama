package exercicio02;

public class Placar {

	private String timeMandante, timeVisitante;
	private int golsTimeMandante, golsTimeVisitante;

	public Placar() {
		this("mandante", "visitante");
	}

	Placar(String timeMandante, String timeVisitante) {
		this.timeMandante = timeMandante;
		this.timeVisitante = timeVisitante;
		this.golsTimeMandante = 0;
		this.golsTimeVisitante = 0;
	}

	public Placar(String timeMandante, String timeVisitante, int golsTimeMandante, int golsTimeVisitante) {
		this.timeMandante = timeMandante;
		this.timeVisitante = timeVisitante;
		this.golsTimeMandante = golsTimeMandante;
		this.golsTimeVisitante = golsTimeVisitante;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return timeMandante + " " + golsTimeMandante + " X " + golsTimeVisitante + " " + timeVisitante;
	}

}
