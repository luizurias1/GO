package src;

import java.util.ArrayList;

public class Ocorrencia {

	private String nome, resumo;
	private int id;
	private Funcionario responsavel;
	private Prioridade prioridade;
	private Tipo tipo;
	private boolean aberta;
	
	public Ocorrencia(String string, int id, String resumo, Funcionario responsavel) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nome = string;
		this.resumo = resumo;
		this.responsavel = responsavel;
		this.prioridade = Prioridade.MEDIA;
		this.tipo = Tipo.TAREFA;
		this.aberta = true;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public String getResumo() {
		// TODO Auto-generated method stub
		return this.resumo;
	}

	public void setPrioridade(Prioridade prioridade) {
		// TODO Auto-generated method stub
		this.prioridade = prioridade;
	}

	public Prioridade getPrioridade() {
		// TODO Auto-generated method stub
		return this.prioridade;
	}

	public Funcionario getResponsavel() {
		// TODO Auto-generated method stub
		return this.responsavel;
	}

	public void setEstado(boolean b) {
		// TODO Auto-generated method stub
		this.aberta = b;
	}

	public boolean getEstado() {
		// TODO Auto-generated method stub
		return this.aberta;
	}

	public void setResponsavel(Funcionario novoResponsavel) {
		// TODO Auto-generated method stub
		this.responsavel = novoResponsavel;
	}

}
