import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == 20) {
				System.out.println("achei");
				break;
			}
			System.out.println(lista.get(i));
		}
		System.out.println("terminou");
		System.out.println(lista.size());
	}
}
