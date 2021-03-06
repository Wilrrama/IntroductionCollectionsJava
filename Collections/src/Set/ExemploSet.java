package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7.0,8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		System.out.println(notas);
		
		System.out.println("Confia se a nota 5.0 est? no conjunto: " + notas.contains(5d));
		
		System.out.println("Exbia a menos nota: " + Collections.min(notas));
		
		System.out.println("Exbia a maior nota: " + Collections.max(notas));
	
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.printf("Exiba a soma dos valores: %.2f%n" , soma);
		
		System.out.printf("Exbia a m?dia das notas: %.2f%n" , soma / notas.size());
		
		System.out.print("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.print("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		
		System.out.println(notas);
		
		System.out.print("Exiba todas as notas na ordem que foram inseridas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		System.out.print("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);

		System.out.print("Apague todo o conjunto: ");
		notas3.clear();
		System.out.println(notas3);
	
		System.out.println("Confira se o conjunto  3 est? vazio: " + notas3.isEmpty());
		
		System.out.println("Confira se o conjunto  2 est? vazio: " + notas2.isEmpty());
		
		System.out.println("Confira se o conjunto  1 est? vazio: " + notas.isEmpty());
		
	}

}
