package exercicio01;

public class Veiculo {
	private String modelo;
	private String marca;
	private double consumo;

	public Veiculo(String modelo, String marca, double consumo) {
		this.modelo = modelo;
		this.marca = marca;
		this.consumo = consumo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public void mostrarInfos() {
		System.out.println(this.modelo);
		System.out.println(this.marca);
	}

	public double mostrarConsumo() {
		return this.consumo;
	}

}
