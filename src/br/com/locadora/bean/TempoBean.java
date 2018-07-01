package br.com.locadora.bean;

public class TempoBean {
	private int idTempo;
	private int qtdDias;
	private String diaAlugado;
	private String diaDevolucao;
	public int getIdTempo() {
		return idTempo;
	}
	public void setIdTempo(int idTempo) {
		this.idTempo = idTempo;
	}
	public int getQtdDias() {
		return qtdDias;
	}
	public void setQtdDias(int qtdDias) {
		this.qtdDias = qtdDias;
	}
	public String getDiaAlugado() {
		return diaAlugado;
	}
	public void setDiaAlugado(String diaAlugado) {
		this.diaAlugado = diaAlugado;
	}
	public String getDiaDevolvido() {
		return diaDevolucao;
	}
	public void setDiaDevolvido(String diaDevolvido) {
		this.diaDevolucao = diaDevolvido;
	}

}
