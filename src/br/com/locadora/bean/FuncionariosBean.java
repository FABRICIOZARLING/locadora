package br.com.locadora.bean;

public class FuncionariosBean {
	private int idFuncionario;
	private String nome;
	private double salario;
	private String cargo;
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getNomeFuncionario() {
		return nome;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nome = nomeFuncionario;
	}
	public double getSalarioFuncionario() {
		return salario;
	}
	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salario = salarioFuncionario;
	}
	public String getCargoFuncionario() {
		return cargo;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargo = cargoFuncionario;
	}

}
