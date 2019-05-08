package model;

public class Secretaria extends Funcionario {
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public void admissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Novembro de 2019");

	}

	@Override
	public void demissao() {
		// TODO Auto-generated method stub
		System.out.println("20 de Novembro de 2039");

	}
}
