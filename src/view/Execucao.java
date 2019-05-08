package view;

import model.Direcao;
import model.Funcionario;
import model.Professor;
import model.Secretaria;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Funcionario f = new Funcionario();
		Professor p = new Professor();
		Secretaria s = new Secretaria();
		Direcao d = new Direcao();
		p.setCurso("Engenharia");
		s.setLogin("09900");
		d.setCargo("Diretor");
		System.out.println(p.getCurso());
		System.out.println(s.getLogin());
		System.out.println(d.getCargo());
		p.admissao();
		p.demissao();
		s.admissao();
		s.demissao();
		d.admissao();
		d.demissao();

	}

}
