package model;

public class Professor extends Funcionario{
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Dezembro de 2019");
	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Dezembro de 2030");

		
	}
	

}
