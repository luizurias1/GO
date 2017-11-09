package src;

import java.util.ArrayList;

public class Projeto {

	private String nome;
	private ArrayList<Ocorrencia> ocorrencias;
	
	public Projeto(String string) {
		// TODO Auto-generated constructor stub
		this.ocorrencias = new ArrayList<Ocorrencia>();
		this.nome = string;
	}

	public void cadastrarOcorrencias(String nome, String resumo, Funcionario responsavel) throws Exception{
		// TODO Auto-generated method stub
		int id = this.ocorrencias.size() + 1;
		int soma = 0;
		for (int i = 0; i < ocorrencias.size(); i++) {
			if(ocorrencias.get(i).getResponsavel().getName() == responsavel.getName());
				soma ++;
		}
		if (soma <= 9)
			this.ocorrencias.add(new Ocorrencia(nome, id, resumo, responsavel));
		else
			throw new Exception("O funcionario não pode trabalhar em mais ocorrencias.");
	}

	public ArrayList<Ocorrencia> getOcorrencias() {
		// TODO Auto-generated method stub
		return this.ocorrencias;
	}

}
