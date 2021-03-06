package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {

	System.out.println("--Ordem Aleat?ria:");
	Set<Serie> minhasSeries = new HashSet<>() {
		private static final long serialVersionUID = 1L;
	{
		add(new Serie ("Got","Fantasia",60));
		add(new Serie ("Dark","Drama",60));
		add(new Serie ("70?s","Comedia",25));
	}};
	for ( Serie serie : minhasSeries) System.out.println(serie.getNome()+"<--->"
		+serie.getGenero()+"<--->"+ serie.getTempoEpisodio());

	System.out.println();
	
	System.out.println("--Ordem de inser??o:");
	Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
		private static final long serialVersionUID = 1L;
	{
		add(new Serie ("Got","Fantasia",60));
		add(new Serie ("Dark","Drama",60));
		add(new Serie ("70?s","Comedia",25));
	}};
	for ( Serie serie : minhasSeries1) System.out.println(serie.getNome()+"--->"
		+serie.getGenero()+"--->"+ serie.getTempoEpisodio());
		
	System.out.println();
	
	System.out.println("--Ordem Natural - Tempo Episodio:");
	Set<Serie> minhasSeries2 = new TreeSet <>(minhasSeries1);
	for ( Serie serie : minhasSeries2) System.out.println(serie.getNome()+"--->"
			+serie.getGenero()+"--->"+ serie.getTempoEpisodio());

	System.out.println();
	
	System.out.println("--Ordem Nome/Genero/Tempo:");
	Set<Serie> minhasSeries3 = new TreeSet <>(new ComparatorNomeGeneroTempo());
	minhasSeries3.addAll(minhasSeries);
	for ( Serie serie : minhasSeries3) System.out.println(serie.getNome()+"--->"
			+serie.getGenero()+"--->"+ serie.getTempoEpisodio());
	
	
	}
}

class Serie implements Comparable <Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempoEpisodio == null) {
			if (other.tempoEpisodio != null)
				return false;
		} else if (!tempoEpisodio.equals(other.tempoEpisodio))
			return false;
		return true;
	}
	@Override
	public int compareTo(Serie o) {		
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
		if (tempoEpisodio !=0 ) return  tempoEpisodio;
		return this.getGenero().compareTo(o.getGenero());
	}
	
}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

	@Override
	public int compare(Serie o1, Serie o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if (nome !=0) return nome;
		
		int genero = o1.getGenero().compareTo(o2.getGenero());
		if (genero !=0) return genero;
		
		return Integer.compare(o1.getTempoEpisodio(), o2.getTempoEpisodio());		
		
	}
	
}
