package com.izadev.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.izadev.workshopmongo.domain.User;
import com.izadev.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		
		userRepository.deleteAll();
		// TODO Auto-generated method stub
		User maria = new User(null,"Maria Brown","maria@outlook.com");
		User alex = new User(null,"Alex Green","alex@outlook.com");
		User bob = new User(null,"Bob Grey","bob@outlook.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
	}

}
