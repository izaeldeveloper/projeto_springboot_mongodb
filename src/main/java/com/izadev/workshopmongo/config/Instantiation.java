package com.izadev.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.izadev.workshopmongo.domain.Post;
import com.izadev.workshopmongo.domain.User;
import com.izadev.workshopmongo.dto.AuthorDTO;
import com.izadev.workshopmongo.repository.PostRepository;
import com.izadev.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		// TODO Auto-generated method stub
		User maria = new User(null,"Maria Brown","maria@outlook.com");
		User alex = new User(null,"Alex Green","alex@outlook.com");
		User bob = new User(null,"Bob Grey","bob@outlook.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!",  new AuthorDTO(maria));
		
		
		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
