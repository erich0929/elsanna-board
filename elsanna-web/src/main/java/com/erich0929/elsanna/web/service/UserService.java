package com.erich0929.elsanna.web.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService  {
	@SuppressWarnings("deprecation")
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException{
		 System.out.println("Getting access details from employee dao !!");
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
		UserDetails user = new User("erich0929", "2642805", true, true, true, true, authorities); //new User("erich0929", "2642805", true, true, true, true, new GrantedAuthority[]{ new GrantedAuthorityImpl("ROLE_USER")});
		return user;
	}
}