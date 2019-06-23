package beans;

public final class EnderecoPaginas {

	public EnderecoPaginas() {
		throw new UnsupportedOperationException("Esta classe não deve ser instanciada!");
	}

	private static final String REDIRECT_TRUE = "?faces-redirect=true";

	public static final String PAGINA_PRINCIPAL = "/index.xhtml" + REDIRECT_TRUE;

	public static final String PAGINA_PRINCIPAL_USUARIO = "/paginas/usuario/index.xhtml" + REDIRECT_TRUE;
	
	public static final String PAGINA_PRINCIPAL_PRODUTO = "/paginas/produto/index.xhtml" + REDIRECT_TRUE;  
	
	public static final String PAGINA_PRINCIPAL_PEDIDO = "/paginas/pedido/index.xhtml" + REDIRECT_TRUE;

}
