package br.com.casadocodigo.livraria.teste;

import java.util.Comparator;

import br.com.casadocodigo.livraria.produtos.Livro;

public class ComparadorPorNome implements Comparator<Livro>{
	
	public int compare(Livro l1, Livro l2){
		return l1.getNome().compareTo(l2.getNome());
	}

}
