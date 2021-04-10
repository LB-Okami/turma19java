package testePOO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList();
		
		list.add("Paulo");
		list.add("Samuel");
		list.add("Sandra");
		list.add("Pedro");
		list.add("Rodrigo");
		
		list.add(0, "Lucas"); // O primeiro par�metro indica o index e o segundo o dado a ser inserido.
		
		list.removeIf(x -> x.charAt(0) == 'P'); // Remove os nomes que come�am com P (o segredo est� na f�rmula)
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		
		System.out.print("Index of J�lio: " + list.indexOf("Sandra"));
		
		System.out.println("\n-----------------------------");
		
		List<String> filtrado = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList()); // Filtra os nomes que come�am com S
		
		for(String x : filtrado) {
			System.out.println(x);
		}
		
		System.out.println("\n-----------------------------");
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		
		System.out.println(nome);
	}

}
