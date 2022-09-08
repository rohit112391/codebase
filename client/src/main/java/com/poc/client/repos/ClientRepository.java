package com.poc.client.repos;

import org.springframework.data.repository.CrudRepository;

import com.poc.client.model.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, String> {

}
