package com.poc.client.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "client")
public class ClientEntity {
	@Id
	String clientId;
	String clientName;
	public ClientEntity() {
	}
	public ClientEntity(String clientId, String clientName) {
		this.clientId = clientId;
		this.clientName = clientName;
	}

	public String getClientId() {
		return clientId;
	}

	public String getClientName() {
		return clientName;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + "]";
	}

	// override equals and hash code

}
