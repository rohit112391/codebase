package com.poc.client.model;

public class Rs<T> {

	private final ResponseStatus status;
	private final T deatails;
	public Rs(ResponseStatus status, T deatails) {
		super();
		this.status = status;
		this.deatails = deatails;
	}
	public ResponseStatus getStatus() {
		return status;
	}
	public T getDeatails() {
		return deatails;
	}
	
}
