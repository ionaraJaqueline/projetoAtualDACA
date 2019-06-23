package beansProduto;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;
import entities.Produto;
import entities.Usuario;
import filters.ProdutoFilter;
import filters.UsuarioFilter;
import impl.ProdutoServiceImpl;
import service.ProdutoService;
import service.ServiceDacException;



@ViewScoped
@ManagedBean
public class ManageProduto extends AbstractBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProdutoService produtoService = new ProdutoServiceImpl();

	private List<Produto> produto;

	private ProdutoFilter produtoFilter;

	public List<Produto> getProduto() {
		return produto;
	}
	public ProdutoFilter getProdutoFilter() {
		return produtoFilter;
	}

	public void setProdutoFilter(ProdutoFilter produtoFilter) {
		this.produtoFilter = produtoFilter;
	}
	@PostConstruct
	public void init() {
		limpar();
		filtrar();
	}
	public String filtrar() {
		try {
			produto = produtoService.findBy(getProdutoFilter());
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}
		return null;
	}

	public String limpar() {
		this.produtoFilter = new ProdutoFilter();
		return null;
	}
	public String delete(Produto produto) {
		try {
			produtoService.delete(produto);
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}
		
		reportarMensagemDeSucesso("Produto '" + produto.getNome() + "' deleted");
		
		return EnderecoPaginas.PAGINA_PRINCIPAL_PRODUTO;
	}
}
