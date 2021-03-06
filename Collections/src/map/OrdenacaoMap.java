package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {
		
	System.out.println("Exbia a cole??o de Ordem Aleatoria:");
	
	Map<String, Livro> meusLivros = new HashMap<>() {
		
		private static final long serialVersionUID = 1L;

	{
		
		put("Hawking, Stephen", new Livro ("Uma Breve Historia do Tempo", 256));
		put("Duhigg, Charles", new Livro ("O poder do Habiro", 408));
		put("Harari, Yuval Noah", new Livro ("21 Li??es do seculo 21", 432));
		
	}};
	
	for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());		

System.out.println();
	
System.out.println("Exbia a cole??o de Ordem de Inser??o:");
	
	Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
		private static final long serialVersionUID = 1L;

	{
		
		put("Hawking, Stephen", new Livro ("Uma Breve Historia do Tempo", 256));
		put("Duhigg, Charles", new Livro ("O poder do Habiro", 408));
		put("Harari, Yuval Noah", new Livro ("21 Li??es do seculo 21", 432));
		
	}};
	
	for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());		

	System.out.println();
	System.out.println("Ordem Alfabetida dos Autores:");
	
	Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
	for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
		System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());	
	
	System.out.println();
	System.out.println("Ordem Alfabetica nomes dos livros");
	
	Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
	meusLivros3.addAll(meusLivros.entrySet());
	for(Map.Entry<String, Livro> livro : meusLivros3)
	System.out.println(livro.getKey()+" - "+ livro.getValue().getNome());

	
	System.out.println();
	System.out.println("Ordenar por numero de paginas: ");
	for(Map.Entry<String, Livro> livro : meusLivros3)
		System.out.println(livro.getValue().getPaginas());
	
	}

}


class Livro {
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

}

class ComparatorNome implements Comparator <Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
}
