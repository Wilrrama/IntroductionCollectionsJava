package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {
		
		System.out.println("Crie uma Lista e adicione as sete notas: ");
		
		List<Double> notas = new ArrayList<>();
		notas.add(7.8);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(8.8);
		notas.add(3.6);
		
		System.out.println(notas);
		
		System.out.println("Exiba a posição da nota 5:" + notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.8 na posição 4: ");
		notas.add(4, 8.0);
		
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
	
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
	
		for ( Double nota : notas) System.out.println(nota);
	
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		
		System.out.println("Exiba a menor nota:" + Collections.min(notas));
		
		System.out.println("Exiba a maior nota:" + Collections.max(notas));
		
		System.out.print("Exiba a soma dos Valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
		Double next = iterator.next();
		soma+=next;
		}
		System.out.printf("%.2f%n",soma);
	
		System.out.printf("Exiba a média das notas: %.2f%n", (soma/notas.size()));
		
		System.out.println("Remova a nota da posição 0:");
		notas.remove(0);
		System.out.println(notas);
	
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1=notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next<7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Apgue toda a lista:");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista esta vazia:" + notas.isEmpty());
	}
}
