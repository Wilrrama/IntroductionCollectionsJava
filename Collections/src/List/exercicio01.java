package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List <Double> temperaturas = new ArrayList<Double>();
		
		
		double soma = 0.0;
		double media = 0.0;
		
		for (int i=0; i < 6; i++) {
			double temp = sc.nextDouble();
			temperaturas.add(temp);
			soma += temp;
			media = soma/temperaturas.size(); 
		}
		
		System.out.println(temperaturas);
		System.out.println(soma);
		System.out.println(media);
		
		sc.close();
		
	}

}
