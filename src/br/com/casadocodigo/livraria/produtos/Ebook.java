package br.com.casadocodigo.livraria.produtos;
import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional{

	public Ebook(Autor autor) {
		super(autor);
	}
	
	private String waterMark;
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem){
		if(porcentagem > 0.15){
			return false;
		}
		double desconto = this.getValor() * porcentagem;
		this.setValor(this.getValor() - desconto);
		return true;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
}
