package com.gen.JUnit2.contatos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gen.JUnit2.model.ContatoModel;
import com.gen.JUnit2.repository.ContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Before
	public void start() {
		contato = new ContatoModel("Lucas Buzo", "3665482154", "11856452254");
		
		
		contato = new ContatoModel("Pedro Aguiar", "854753214", "51986521452");
		
		
		contato = new ContatoModel("Lucas Silva", "56328428", "11985632542");
		
		
		contato = new ContatoModel("Ana Clara", "366189625256", "81547258315");
	}
	
	@Test
	public void findByNomeRetornaContato() throws Exception{
		ContatoModel contato = contatoRepository.findFirstByNome("Lucas");

		Assert.assertTrue(contato.getCpf().equals("366"));
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarNomeNull() throws Exception {
		
		contato.setNome(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarCpfNull() throws Exception {
		
		contato.setCpf(null);
		contatoRepository.save(contato);
	}
	
	@Test(expected = RuntimeException.class)
	public void salvarTelNull() throws Exception {
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
}
