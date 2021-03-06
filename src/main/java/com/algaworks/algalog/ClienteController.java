package com.algaworks.algalog;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
public class ClienteController {
     
	@GetMapping("/cliente")
	public List<Cliente> listar(){
	  var cliente1 = new Cliente();
	  cliente1.setId(1L);
	  cliente1.setNome("Joao");
	  cliente1.setTelefone("34 99999-5697");
	  cliente1.setEmail("joaodascouves@algaworks.com");
	  
	  var cliente2 = new Cliente();
	  cliente2.setId(2L);
	  cliente2.setNome("Maria");
	  cliente2.setTelefone("27 99569-3257");
	  cliente2.setEmail("mariadasilva@algaworks.com");
	  
	  return Arrays.asList(cliente1, cliente2);
	  
	
	}
		
	  }
