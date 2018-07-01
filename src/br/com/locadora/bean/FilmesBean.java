package br.com.locadora.bean;

public class FilmesBean {
	private int idFilme;
	private String filme;
	private int genero;
	private int produtora;
	private int classificacao;
	private String datalancamento;
	private int Tipo;
	private int estoque;
	public int getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}
	public String getNomeFilme() {
		return filme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.filme = nomeFilme;
	}
	public int getIdGenero() {
		return genero;
	}
	public void setIdGenero(int idGenero) {
		this.genero = idGenero;
	}
	public int getIdProdutora() {
		return produtora;
	}
	public void setIdProdutora(int idProdutora) {
		this.produtora = idProdutora;
	}
	public int getIdadeclassificacao() {
		return classificacao;
	}
	public void setIdadeclassificacao(int idadeclassificacao) {
		this.classificacao = idadeclassificacao;
	}
	public String getDatalancamento() {
		return datalancamento;
	}
	public void setDatalancamento(String datalancamento) {
		this.datalancamento = datalancamento;
	}
	public int getIdTipo() {
		return Tipo;
	}
	public void setIdTipo(int idTipo) {
		this.Tipo = idTipo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	

}
