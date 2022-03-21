package exercicio01;

public class TestarVeiculo {
public static void main(String[] args) {
Veiculo carro=new Veiculo("uno", "fiat", 10.0);
carro.mostrarInfos();
System.out.println(carro.mostrarConsumo());
}
}
