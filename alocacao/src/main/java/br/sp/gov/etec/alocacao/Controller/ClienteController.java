package br.sp.gov.etec.alocacao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Cliente;
import br.sp.gov.etec.alocacao.repository.ClienteRepository;

@RestController
public class ClienteController {
	@Autowired
	ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> ListarCliente(){
		return repository.findAll();
	}
	
	@PostMapping("adicionar-cliente")
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
}
