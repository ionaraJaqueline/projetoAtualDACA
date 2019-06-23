/*package beansPedido;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;

import entities.Pedido;
import entities.TipoDePagamento;
import impl.PedidoServiceImpl;
import service.PedidoService;
import service.ServiceDacException;

@ViewScoped
@ManagedBean
public class PedidoEdit extends AbstractBean {
	private static final long serialVersionUID = -7779155604704232174L;
	private PedidoService pedidoService = new PedidoServiceImpl();
	private Pedido pedido;

	public void init() {
		try {
			if (pedido == null) {
				// Criando
				pedido = new Pedido();
			} else {
				// Editando
				if (isEdicaoPedido()) {
					pedidoService.update(pedido);
				} else {
					pedidoService.save(pedido);
				}
			}
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
		}
	}

	public String savePedido() {
		try {
			if (isEdicaoPedido()) {
				pedidoService.update(pedido);
			} else {
				pedidoService.save(pedido);
			}
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}

		reportarMensagemDeSucesso("Pedido '" + pedido.getId() + "' saved");

		return EnderecoPaginas.PAGINA_PRINCIPAL_PEDIDO;
	}

	public Pedido getP() {
	return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public boolean isEdicaoPedido() {
		return pedido != null && pedido.getId() != null;
	}

	public boolean isDinheiro() {
		return pedido != null && pedido.getTipoDePagamento() == TipoDePagamento.DINHEIRO;
	}

	public boolean isCartaoDebito() {
		return pedido != null && pedido.getTipoDePagamento() == TipoDePagamento.CARTAO_DEBITO;
	}

	public boolean isCartaoCredito() {
		return pedido != null && pedido.getTipoDePagamento() == TipoDePagamento.CARTAO_CREDITO;
	}
	public Pedido getPedido() {
		return pedido;
	}
	
}*/
