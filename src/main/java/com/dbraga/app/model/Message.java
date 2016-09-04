package com.dbraga.app.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "message")
public class Message {
	private String name;
	private String text;
	private Date date = new Date();

	public Message(){ }
	
	public Message(String name, String text) {
		super();
		this.name = name;
		this.text = text;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@XmlElement
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "{name:" + name + ", text:" + text + ", date:" + date + "}";
	}

}
