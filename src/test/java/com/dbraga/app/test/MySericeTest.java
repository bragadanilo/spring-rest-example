package com.dbraga.app.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.dbraga.app.model.Message;
import com.dbraga.app.service.MyService;



public class MySericeTest {
	
	@Test
	public void itShouldAddAMessage() {
		MyService service = new MyService();
		service.add(new Message("Name", "Text"));
		
		Assert.assertNotEquals(service.get("Name"), null);
		Assert.assertEquals(service.get("Name").getName(), "Name");
	}
	
	@Test
	public void itShouldListAllMessages() {
		MyService service = new MyService();
		service.add(new Message("Name2", "Text2"));
		service.add(new Message("Name3", "Text3"));
		
		List<Message> all = service.all();
		//System.out.println(all);
		
		Assert.assertEquals(all.size() > 0, true);
	}
	
	@Test
	public void itShouldDeleteMessage() {
		MyService service = new MyService();
		service.add(new Message("Name4", "Text4"));
		
		Message messageDeleted = service.delete("Name4");
		
		Assert.assertNotEquals(messageDeleted, null);
		Assert.assertEquals(messageDeleted.getName(), "Name4");
	}
	
	@Test
	public void itShouldUpdateMessage() {
		MyService service = new MyService();
		service.add(new Message("Name5", "Text5"));
		
		service.update("Name5", new Message("Name Updated", "Text Updated"));
		
		Message messageUpdated = service.get("Name Updated");
		
		Assert.assertNotEquals(messageUpdated, null);
		Assert.assertEquals(messageUpdated.getName(), "Name Updated");
	}
	
	

}
