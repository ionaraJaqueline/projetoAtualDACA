package beansUsuario;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import beans.AbstractBean;
import beans.EnderecoPaginas;
import entities.Usuario;
import filters.UsuarioFilter;
import impl.UsuarioServiceImpl;
import service.ServiceDacException;
import service.UsuarioService;


@ViewScoped
@ManagedBean
public class ManageUsuario extends AbstractBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UsuarioService usuarioService = new UsuarioServiceImpl();

	private List<Usuario> usuario;

	private UsuarioFilter usuarioFilter;

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public UsuarioFilter getUsuarioFilter() {
		return usuarioFilter;
	}

	public void setUsuarioFilter(UsuarioFilter usuarioFilter) {
		this.usuarioFilter = usuarioFilter;
	}

	@PostConstruct
	public void init() {
		limpar();
		filtrar();
	}

	public String filtrar() {
		try {
			usuario = usuarioService.findBy(getUsuarioFilter());
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}
		return null;
	}

	public String limpar() {
		this.usuarioFilter = new UsuarioFilter();
		return null;
	}
	public String delete(Usuario usuario) {
		try {
			usuarioService.delete(usuario);
		} catch (ServiceDacException e) {
			reportarMensagemDeErro(e.getMessage());
			return null;
		}
		
		reportarMensagemDeSucesso("Usuario '" + usuario.getNome() + "' deleted");
		
		return EnderecoPaginas.PAGINA_PRINCIPAL_USUARIO;
	}

}

