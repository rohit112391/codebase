package com.poc.client.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.client.model.Client;
import com.poc.client.model.ClientEntity;
import com.poc.client.model.ResponseStatus;
import com.poc.client.model.Rs;
import com.poc.client.repos.ClientRepository;

@Service
public class ClientApiService {

	@Autowired
	private ClientRepository clientRepository;

	@SuppressWarnings("unchecked")
	public Rs getClient(String id) {
		Optional<ClientEntity> clientEntity = clientRepository.findById(id);
		if (clientEntity.isPresent()) {
			return new Rs(ResponseStatus.Success, new Client(clientEntity.get().getClientId(), clientEntity.get().getClientName()));
		} else {
			return new Rs(ResponseStatus.Success,"Client not found!!");
		}
	}

	@SuppressWarnings("unchecked")
	public Rs addClient(String id,String name) {
		try {

			clientRepository.save(new ClientEntity(id, name));

			System.out.println("addClient done");

			return new Rs(ResponseStatus.Success, "client add success clientId = " + id);
		} catch (Exception ex) {
			return new Rs(ResponseStatus.Failure, "client add failed clientId error= " + ex.getMessage());
		}
	}

	/*
	 * public String updateClient(Client client) { try {
	 * System.out.println("update done");
	 * 
	 * clientRepository.save(new ClientEntity(client.getClientId(),
	 * client.getClientName()));
	 * 
	 * System.out.println("update done"); return "client update success";
	 * 
	 * } catch (Exception ex) { System.out.println(ex.getMessage()); return
	 * "client update failed " + ex.getMessage();
	 * 
	 * } }
	 * 
	 * public void deleteClient(Client client) { try {
	 * System.out.println("deleteClient done"); clientRepository.delete(new
	 * ClientEntity(client.getClientId(), client.getClientName()));
	 * System.out.println("deleteClient done"); } catch (Exception ex) {
	 * System.out.println(ex.getMessage()); } }
	 */
}
