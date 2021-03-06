package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
		
		System.out.println("Crie um dicionario que relacione os modelos respectivos");
		
		Map<String, Double> carrosPopulares = new HashMap<>() {
			private static final long serialVersionUID = 1L;

		{
			put("Gol",14.4);
			put("Uno",15.6);
			put("Mobi",16.1);
			put("HB20",14.5);
			put("Kwid",15.6);
			
		}};
		System.out.println(carrosPopulares.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l");
		carrosPopulares.put("Gol", 16.1);
		
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo tucson esta no dicionario: " + carrosPopulares.containsKey("tucson"));
	
		System.out.println("Exiba os Modelos:");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos:");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais Eficiente e seu consumo ");
		
		Double consumoMaisEficiente =  Collections.max(carrosPopulares.values());
		
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry: entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " Consumo: " + consumoMaisEficiente);
			}
		}
		
		System.out.println("Exiba o modelo menos Economico e seu consumo ");
	
		Double consumoMaisEconomico = Collections.min(carrosPopulares.values());
		
		String modeloMaisEconomico = "";
		
		for(Map.Entry<String, Double> entry: entries) {
			if (entry.getValue().equals(consumoMaisEconomico)) {
				modeloMaisEconomico = entry.getKey();
				System.out.println("Modelo menos Economico: "+ modeloMaisEconomico + " Consumo: " + consumoMaisEconomico);
			}
		}
		
		System.out.print("Exiba a soma dos valores dos consumos : ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double  soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println(soma);
		
		
		System.out.println("Exiba a media dos consumos: "+ (soma / carrosPopulares.size()));
	
		System.out.println(carrosPopulares);
		
	    System.out.println("Remova os modelos com consumo igual a 15.6");
	    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
	    while (iterator1.hasNext()) {
	    	if(iterator1.next().equals(15.6)) iterator1.remove();	
	    }
	    
	    System.out.println(carrosPopulares);
	    
	    System.out.println("Exiba  todos os carros na ordem");
	
	    Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
			 
			private static final long serialVersionUID = 1L;

		{
	    	put("Gol",14.4);
			put("Uno",15.6);
			put("Mobi",16.1);
			put("HB20",14.5);
			put("Kwid",15.6);
	    	
	    }};
	    
	    System.out.println(carrosPopulares1.toString());
	    
	    System.out.println("Exiba  todos os carros ordenados pelo Modelo");
	    Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
	    System.out.println(carrosPopulares2.toString());
	    
	
	    System.out.println("Apague uma cole??o: (0) ");
	    carrosPopulares.clear();
	
	    System.out.println("Confira se est? vazio (0): " + carrosPopulares.isEmpty());
	    
	    System.out.println("Confira se est? vazio (1): " + carrosPopulares1.isEmpty());
	    
	}

	
}
