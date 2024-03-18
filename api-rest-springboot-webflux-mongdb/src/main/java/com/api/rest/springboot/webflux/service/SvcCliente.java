package com.api.rest.springboot.webflux.service;

import com.api.rest.springboot.webflux.documents.Cliente;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SvcCliente
{
	public Flux<Cliente> findAll();
	
	public Mono<Cliente> findById(String id);
	
	public Mono<Cliente> save(Cliente cliente);
	
	public Mono<Void> delete(Cliente cliente);
	
}
