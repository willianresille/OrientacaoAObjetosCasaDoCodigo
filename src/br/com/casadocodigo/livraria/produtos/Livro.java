package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public abstract class Livro implements Produto{

	private	String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor){
		if(autor == null){
			throw new AutorNuloException("O Autor do Livro não pode ser nulo");
		}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	@Override
	public int compareTo(Produto produto){
		return (int) (this.getValor() - produto.getValor());
	}
	
	public void mostraDetalhes(){
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: "+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Valor: R$"+valor);
		System.out.println("ISBN: "+isbn);
		if(this.temAutor()){
			autor.mostrarDetalhes();
		}
		System.out.println("--");
	}
	
	public boolean temAutor(){
		return this.autor != null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
