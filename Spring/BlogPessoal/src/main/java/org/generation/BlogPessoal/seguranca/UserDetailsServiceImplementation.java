package org.generation.BlogPessoal.seguranca;

import java.util.Optional;

import org.generation.BlogPessoal.model.Usuario;
import org.generation.BlogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

// Essa camada se encarrega de receber e fazer o tratamento dos dados de um novo cadastro

@Service // Define que é um service
public class UserDetailsServiceImplementation implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<Usuario> user = userRepository.findByEmail(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found.")); // caso não ache o nome
		
		return user.map(UserDetailsImplementation::new).get();
	}
	
	
}
