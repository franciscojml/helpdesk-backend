package com.fjlima.helpdesk.api.security.model;

import com.fjlima.helpdesk.api.entity.User;

public class CurrentUser {

	private String token;

	private User user;

	public CurrentUser() {
		// TODO Auto-generated constructor stub
	}

	public CurrentUser(String token, User user) {
		super();
		this.token = token;
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
