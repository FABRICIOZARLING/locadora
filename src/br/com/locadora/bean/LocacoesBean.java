package br.com.locadora.bean;

public class LocacoesBean {
	private int idLocacao;
	private int cliente;
	private int filme;
	private int tempo;
	private int preco;
	private int vendedor;
	public int getIdLocacao() {
		return idLocacao;
	}
	public void setIdLocacao(int idLocacao) {
		this.idLocacao = idLocacao;
	}
	public int getIdCliente() {
		return cliente;
	}
	public void setIdCliente(int idCliente) {
		this.cliente = idCliente;
	}
	public int getIdFilme() {
		return filme;
	}
	public void setIdFilme(int idFilme) {
		this.filme = idFilme;
	}
	public int getIdTempo() {
		return tempo;
	}
	public void setIdTempo(int idTempo) {
		this.tempo = idTempo;
	}
	public int getIdPreco() {
		return preco;
	}
	public void setIdPreco(int idPreco) {
		this.preco = idPreco;
	}
	public int getIdFuncionario() {
		return vendedor;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.vendedor = idFuncionario;
	}

}
