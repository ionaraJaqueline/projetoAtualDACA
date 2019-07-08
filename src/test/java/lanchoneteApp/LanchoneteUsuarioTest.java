package lanchoneteApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import entities.Contato;
import entities.Endereco;
import entities.Group;
import entities.Usuario;

public class LanchoneteUsuarioTest {
	
	private Usuario user;
	private Endereco end;
	private Contato cont;
	private Group grupo;
	
	@Before
	public void setUp() {
		pegarUsuario();
		
	}
	@Test
	public void adicaoUsuarioTest() {
		
		assertEquals(pegarUsuario(), user);
	}
	@Test
	public void usuarioNulotest() {
		
		assertNotNull("Deve retornar o objeto user. ", user);
		
	}
	@Test
	public void retornaNomeDeUsuarioTest() {
		
		assertTrue("Deve retornar o nome Elson como resultado. ", user.getNome() == "Elson");
		
	}
	
	@Test
	public void retornaSobreNomeDeUsuarioTest() {
		
		assertTrue("Deve retornar o sobrenome 'Farias' como resultado. ", user.getSobreNome() == "Farias");
		
	}
	
	@Test
	public void retornaCpfDeUsuarioTest() {
		
		assertTrue("Deve retornar o cpf '07337232411' como resultado", user.getCpf().equals("07337232411"));
	}
	
	@Test
	public void retornaDeUsuarioTest() {
		
		assertEquals("Devolve o número do cpf: ", "07337232411", user.getCpf());
	}
	public Usuario pegarUsuario() {
		user =  new Usuario();
		user.setId(1);
		user.setCpf("07337232411");
		user.setNome("Elson");
		user.setSobreNome("Farias");
		user.setLogin("els");
		user.setPassword("els");
		user.setGroup(grupo.CLIENTE);
		user.setEndereco(pegaEndereco());
		user.setContato(pegaContato());
		return user;
	}
	
	private Contato pegaContato() {
		cont = new Contato();
		cont.setEmail("els@gmail.com");
		cont.setTelefone("83996854852");
		cont.setId(1L);
		return cont;
	}

	public Endereco pegaEndereco() {
		end = new Endereco();
		end.setBairro("Centro");
		end.setCep("58540000");
		end.setId(1L);
		end.setRua("Aleixo Bezerra");
		end.setNumero("1");
		return end;
		
	}

}
