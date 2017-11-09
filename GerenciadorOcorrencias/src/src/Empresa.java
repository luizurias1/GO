package src;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Projeto> projetos;
	
	public Empresa(){
		this.funcionarios = new ArrayList<Funcionario>();
		this.projetos = new ArrayList<Projeto>();
	}
	
	public void cadastrarFuncionario(String string) {
		// TODO Auto-generated method stub
		this.funcionarios.add(new Funcionario(string));
	}

	public ArrayList<Funcionario> getFuncionarios() {
		// TODO Auto-generated method stub
		return this.funcionarios;
	}

	public void cadastrarProjeto(String string) {
		// TODO Auto-generated method stub
		this.projetos.add(new Projeto(string));
	}

	public ArrayList<Projeto> getProjetos() {
		// TODO Auto-generated method stub
		return this.projetos;
	}

}
