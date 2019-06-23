package filters;

import java.util.Date;

import entities.TipoDePagamento;
import service.ServiceDacException;

public class PedidoFilter {
	private static final long serialVersionUID = 1L;

	private Integer qtdBebida;
	private Integer qtdSobreMesa;
	private Integer qtdLanche;
	private Date inicioDataDoPedido;
	private Date fimDataDoPedido;
	private Float valorUnitario;
	private Float valorTotal;
	private TipoDePagamento tipoDePagamento;

	public PedidoFilter() {

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
	

	public Date getInicioDataDoPedido() {
		return inicioDataDoPedido;
	}

	public void setInicioDataDoPedido(Date inicioDataDoPedido) {
		this.inicioDataDoPedido = inicioDataDoPedido;
	}

	public Date getFimDataDoPedido() {
		return fimDataDoPedido;
	}

	public void setFimDataDoPedido(Date fimDataDoPedido) {
		this.fimDataDoPedido = fimDataDoPedido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isEmpty() {

		if (this.qtdBebida != null) {
			return false;
		}
		if (this.qtdLanche != null) {
			return false;
		}
		if (this.qtdSobreMesa != null) {
			return false;
		}
		if (this.inicioDataDoPedido != null) {
			return false;
		}
		if (this.fimDataDoPedido != null) {
			return false;
		}
		if (this.tipoDePagamento != null) {
			return false;
		}
		if (this.valorTotal != null) {
			return false;
		}
		if (this.valorUnitario != null) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "PedidoFilter [qtdBebida=" + qtdBebida + ", qtdSobreMesa=" + qtdSobreMesa + ", qtdLanche=" + qtdLanche
				+ ", inicioDataDoPedido=" + inicioDataDoPedido + ", fimDataDoPedido=" + fimDataDoPedido
				+ ", valorUnitario=" + valorUnitario + ", valorTotal=" + valorTotal + ", tipoDePagamento="
				+ tipoDePagamento + "]";
	}

	public void validate() throws ServiceDacException {
		if (this.inicioDataDoPedido != null && this.fimDataDoPedido != null) {
			if (this.inicioDataDoPedido.after(this.fimDataDoPedido)) {
				throw new ServiceDacException("'\r\n" + "'The start of the order interval \"must be before\" the end of the requested period'!");
			}
		}
	}

}
