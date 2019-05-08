package model;

public class Direcao extends Funcionario {
	private String cargo;

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Junho de 2019");

	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Junho de 2039");

	}

}
