package com.dbraga.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbraga.app.model.Message;

@Service
public class MyService {
	
	private static List<Message> list = new ArrayList<>();
	private Message NOT_FOUND_MESSAGE = new Message("Not Found", "Message not found");
	
	
	public Message get(String name) {
		Optional<Message> filter = list.stream().filter(m -> m.getName().equals(name)).findAny();
		return filter.orElse(NOT_FOUND_MESSAGE);
	}
	
	public List<Message> all() {
		return list;
	}
	
	public boolean add(Message message) {
		return list.add(message);
	}
	
	public Message update(String name, Message messageUpdated) {
		int index = indexOf(name);
		if(index >= 0){
			list.set(index, messageUpdated);
			return messageUpdated;
		}
		else
			return NOT_FOUND_MESSAGE;
	}
	
	public Message delete(String name) {
		int index = indexOf(name);
		if(index >= 0){
			return list.remove(index);
		}
		else
			return NOT_FOUND_MESSAGE;
	}
	
	
	
	private int indexOf(String name) {
		int index = -1;
		for (index = 0; index < list.size(); index++) {
			if(name != null && name.equals(list.get(index).getName()))
				return index;
		}
		return index;
	}

}
