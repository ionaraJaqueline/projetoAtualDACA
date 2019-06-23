package entities;

import java.util.Date;

public class Funcionario extends Usuario {
	private Float salario;

	public Funcionario() {

	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

}