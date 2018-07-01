package br.com.locadora.bean;

public class ClientesBean {
	
	//Atributos
	private  int idCliente;
	private String nome;
	private int idade;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nome;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nome = nomeCliente;
	}
	public int getIdadeCliente() {
		return idade;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idade = idadeCliente;
	}
}
