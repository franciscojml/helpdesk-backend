package com.fjlima.helpdesk.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.fjlima.helpdesk.api.entity.User;
import com.fjlima.helpdesk.api.enums.ProfileEnum;

public class JwtUserFactory {

	public JwtUserFactory() {
		// TODO Auto-generated constructor stub
	}

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), mapToGrantedAuthority(user.getProfile()));
	}

	private static List<GrantedAuthority> mapToGrantedAuthority(ProfileEnum profileEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
		return authorities;
	}

}
