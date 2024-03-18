package com.api.rest.springboot.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.springboot.webflux.documents.Cliente;
import com.api.rest.springboot.webflux.repository.RepoCliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SvcClienteImp implements SvcCliente
{
	@Autowired
	private RepoCliente repoCliente;

	@Override
	public Flux<Cliente> findAll() {
		return repoCliente.findAll();
	}

	@Override
	public Mono<Cliente> findById(String id) {
		return repoCliente.findById(id);
	}

	@Override
	public Mono<Cliente> save(Cliente cliente) {
		return repoCliente.save(cliente);
	}

	@Override
	public Mono<Void> delete(Cliente cliente) {
		return repoCliente.delete(cliente);
	}
	
}
