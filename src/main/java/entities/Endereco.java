package entities;

public class Endereco {
	private String rua;
	private Integer numero;
	private String bairro;
	private Float cep;

	public Endereco() {

	}
	

	public Endereco(String rua, Integer numero, String bairro, Float cep) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
	}


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Float getCep() {
		return cep;
	}

	public void setCep(Float cep) {
		this.cep = cep;
	}

	
	

}
