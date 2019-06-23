	package entities;

import java.util.Calendar;
import java.util.Date;

public class Pedido implements Identificavel {
	private Integer id;
	private Integer qtdBebida;
	private Integer qtdSobreMesa;
	private Integer qtdLanche;
	private Float valorUnitario;
	private Float valorTotal;
	private Date dataDoPedido;

	private TipoDePagamento tipoDePagamento;

	public Pedido() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQtdBebida() {
		return qtdBebida;
	}

	public void setQtdBebida(Integer qtdBebida) {
		this.qtdBebida = qtdBebida;
	}

	public Integer getQtdSobreMesa() {
		return qtdSobreMesa;
	}

	public void setQtdSobreMesa(Integer qtdSobreMesa) {
		this.qtdSobreMesa = qtdSobreMesa;
	}

	public Integer getQtdLanche() {
		return qtdLanche;
	}

	public void setQtdLanche(Integer qtdLanche) {
		this.qtdLanche = qtdLanche;
	}

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public TipoDePagamento getTipoDePagamento() {
		return tipoDePagamento;
	}

	public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
		this.tipoDePagamento = tipoDePagamento;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((qtdBebida == null) ? 0 : qtdBebida.hashCode());
		result = prime * result + ((qtdSobreMesa == null) ? 0 : qtdSobreMesa.hashCode());
		result = prime * result + ((qtdLanche == null) ? 0 : qtdLanche.hashCode());
		result = prime * result + ((valorUnitario == null) ? 0 : valorTotal.hashCode());
		result = prime * result + ((tipoDePagamento == null) ? 0 : tipoDePagamento.hashCode());
		result = prime * result + ((dataDoPedido == null) ? 0 : removeTime(dataDoPedido).hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (qtdBebida == null) {
			if (other.qtdBebida != null)
				return false;
		} else if (!qtdBebida.equals(other.qtdBebida))
			return false;
		if (qtdSobreMesa == null) {
			if (other.qtdSobreMesa != null)
				return false;
		} else if (!qtdSobreMesa.equals(other.qtdSobreMesa))
			return false;
		if (tipoDePagamento != other.tipoDePagamento)
			return false;
		if (qtdLanche == null) {
			if (other.qtdLanche != null)
				return false;
		} else if (!qtdLanche.equals(other.qtdLanche))
			return false;
		if (valorUnitario == null) {
			if (other.valorUnitario != null)
				return false;
		} else if (!valorUnitario.equals(other.valorUnitario))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		if (dataDoPedido== null) {
			if (other.dataDoPedido != null)
				return false;
		} else if (!dataDoPedido.equals(other.dataDoPedido))
			return false;
		return true;
	}

	private Date removeTime(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", qtdBebida=" + qtdBebida + ", qtdSobreMesa=" + qtdSobreMesa + ", qtdLanche="
				+ qtdLanche + ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + ", dataDoPedido="
				+ dataDoPedido + ", tipoDePagamento=" + tipoDePagamento + "]";
	}

	@Override
	public Pedido clone() {
		Pedido clone = new Pedido();
		clone.setId(id);
		clone.setQtdBebida(qtdBebida);
		clone.setQtdSobreMesa(qtdSobreMesa);
		clone.setQtdLanche(qtdLanche);
		clone.setValorUnitario(valorUnitario);
		clone.setTipoDePagamento(tipoDePagamento);
		clone.setValorTotal(valorTotal);
		clone.setDataDoPedido(dataDoPedido);

		return clone;
	}

}
