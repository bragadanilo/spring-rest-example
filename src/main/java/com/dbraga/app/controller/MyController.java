package com.dbraga.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbraga.app.model.Message;
import com.dbraga.app.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	private MyService service;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Hey! Welcome to Spring Rest";
	}
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET,produces="application/json")
	public Message message(@PathVariable String name) {
		Message msg = new Message(name, "Hello " + name);
		return msg;
	}
	
	@RequestMapping(value = "/rest/", method = RequestMethod.GET,produces="application/json")
	public List<Message> getMessage() {
		return service.all();
	}
	
	@RequestMapping(value = "/rest/{name}", method = RequestMethod.GET,produces="application/json")
	public Message getMessage(@PathVariable String name) {
		return service.get(name);
	}
	
	@RequestMapping(value = "/rest", method = RequestMethod.POST, produces="application/json")
	public Message postMethod(@RequestBody Message input) {
		// HTTP body example: { "name": "dan", "text": "any text" }
		
		boolean added = service.add(input);
		
		System.out.println("Message received" + input + " added: "+added);
		return input;
	}
	
	@RequestMapping(value = "/rest/{name}", method = RequestMethod.PUT, produces="application/json")
	public Message putMethod(@PathVariable String name, @RequestBody Message input) {
		// HTTP body example: { "name": "dan", "text": "any text" }
		
		Message messageUpdated = service.update(name, input);
				
		return messageUpdated;
	}
	
	@RequestMapping(value = "/rest/{name}", method = RequestMethod.DELETE, produces="application/json")
	public Message deleteMethod(@PathVariable String name) {
		Message messageDeleted = service.delete(name);
		
		return messageDeleted;
	}
}
