/*package beansPedido;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;
import entities.Pedido;

import filters.PedidoFilter;

import impl.PedidoServiceImpl;
import service.PedidoService;
import service.ServiceDacException;

@ViewScoped
@ManagedBean
public class ManagePedido extends AbstractBean {
	private static final long serialVersionUID = 1L;

	private PedidoService pedidoService = new PedidoServiceImpl();

	private List<Pedido> pedidos;

	private PedidoFilter pedidoFilter;

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public PedidoFilter getPedidoFilter() {
		return pedidoFilter;
	}

	public void setPedidoFilter(PedidoFilter pedidoFilter) {
		this.pedidoFilter = pedidoFilter;
	}

	@PostConstruct
	public void init() {
		limpar();
		filtrar();
	}

	public String filtrar() {
		try {
			pedidos = pedidoService.findBy(getPedidoFilter());
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}
		return null;
	}

	public String limpar() {
		this.pedidoFilter = new PedidoFilter();
		return null;
	}

	public String delete(Pedido pedido) {
		try {
			pedidoService.delete(pedido);
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}

		reportarMensagemDeSucesso("Pedido '" + pedido.getId() + "' deleted");

		return EnderecoPaginas.PAGINA_PRINCIPAL_PEDIDO;
	}
}*/