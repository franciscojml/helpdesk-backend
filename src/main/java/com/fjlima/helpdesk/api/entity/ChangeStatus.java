package com.fjlima.helpdesk.api.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fjlima.helpdesk.api.enums.StatusEnum;

@Document
public class ChangeStatus implements Serializable {

	@Id
	private String id;

	@DBRef
	private Ticket ticket;

	@DBRef
	private User userChanges;

	private Date dateChange;

	private StatusEnum status;

	public ChangeStatus() {
		// TODO Auto-generated constructor stub
	}

	public ChangeStatus(String id, Ticket ticket, User userChanges, Date dateChange, StatusEnum status) {
		super();
		this.id = id;
		this.ticket = ticket;
		this.userChanges = userChanges;
		this.dateChange = dateChange;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChanges() {
		return userChanges;
	}

	public void setUserChanges(User userChanges) {
		this.userChanges = userChanges;
	}

	public Date getDateChange() {
		return dateChange;
	}

	public void setDateChange(Date dateChange) {
		this.dateChange = dateChange;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
}
