package com.api.rest.springboot.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.api.rest.springboot.webflux.documents.Cliente;

public interface RepoCliente extends ReactiveMongoRepository<Cliente, String>
{

}
