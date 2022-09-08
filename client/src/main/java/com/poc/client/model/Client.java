package com.poc.client.model;

public class Client {

	private final String clientId;
	private final String clientName;
	public Client(String clientId, String clientName) {
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
	
	//override equals and hash code
	
}
