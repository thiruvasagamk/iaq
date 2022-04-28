package com.fourcorners.aiq.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "tbl_messages")
public class IqaParameters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="messageID")
    private Long messageID;
	
	@Column(name="clientID")
	private String clientID;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="message")  
	private String message; 
	
	@Column(name="Enable")  
	private String Enable; 
	
	@Column(name="Date") 
    private Date Date; 

	public Long getMessageID() {
		return messageID;
	}

	public void setMessageID(Long messageID) {
		this.messageID = messageID;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEnable() {
		return Enable;
	}

	public void setEnable(String enable) {
		Enable = enable;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}
	 
	
}
