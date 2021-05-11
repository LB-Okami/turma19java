package com.gen.JUnit2.contatos;

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
		contato = new ContatoModel("Lucas", "3665482154", "11856452254");
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
