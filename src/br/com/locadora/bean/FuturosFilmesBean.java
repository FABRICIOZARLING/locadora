package br.com.locadora.bean;

public class FuturosFilmesBean {
	private int idFilme;
	private String filme;
	private int genero;
	private String dataLancamento;
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
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	

}
