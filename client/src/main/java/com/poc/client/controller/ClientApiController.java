package com.poc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.client.model.ResponseStatus;
import com.poc.client.model.Rs;
import com.poc.client.service.ClientApiService;

@RestController
@RequestMapping("/api/")
public class ClientApiController {

	@Autowired
	ClientApiService clientApiService;

	@PostMapping("addclient")
	public ResponseEntity<Rs> createClient(@RequestParam(value = "id") String id,
			@RequestParam(value = "name") String name) {
		// validate client
		Rs res = clientApiService.addClient(id, name);
		if (res.getStatus().equals(ResponseStatus.Success)) {
			return new ResponseEntity<>(res, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("getclient/{id}")
	public @ResponseBody Rs getClientDetailsById(@PathVariable String id) {
		return clientApiService.getClient(id);
	}

	@GetMapping("clientexpense/{id}")
	public String getClientExpenseById(String clinetId) {
		return null;
	}

}
