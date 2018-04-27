package com.fjlima.helpdesk.api.entity;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fjlima.helpdesk.api.enums.ProfileEnum;

@Document
public class User implements Serializable {

	@Id
	private String id;

	@Indexed(unique = true)
	@NotBlank(message = "Email required")
	@Email(message = "Email inválido")
	private String email;

	@NotBlank(message = "Password required")
	@Size(min = 6)
	private String password;

	private ProfileEnum profile;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

}
