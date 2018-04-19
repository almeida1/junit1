package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Usuario;

public class UC02CadastrarUsuario {
public static Usuario usuario;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		usuario = new Usuario();
		usuario.setNome("Jose da Silva");
		usuario.setRa("121221");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test(expected=RuntimeException.class)
	public void CT01UC02CadastrarUsuario_com_ra_invalido_branco() {
		usuario.setRa("");
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC02CadastrarUsuario_com_ra_invalido_nulo() {
		usuario.setRa(null);
	}
	@Test
	public void CT03UC02CadastrarUsuario_obtem_ra() {
		usuario.setRa("121221");
		assertEquals("121221",usuario.getRa());
	}
	
	@Test
	public void CT04UC02CadastrarUsuario_teste_estado() {
		Usuario resultadoEsperado = new Usuario();
		resultadoEsperado.setNome("Jose da Silva");
		resultadoEsperado.setRa("121221");
		assertTrue(resultadoEsperado.equals(usuario));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
