package com.bocobi2.model;

import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.bocobi2.dao.InternauteDAO;

@Component
public class UserDetailsServices implements UserDetailsService{
	@Autowired
	InternauteDAO internauteDAO;
		@Override
		public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Set<GrantedAuthority> grantedAuthority =new HashSet<>();
		for(Role role:((InternauteDAO) internauteDAO).findByLogin(login).getRoles()){
			grantedAuthority.add(new SimpleGrantedAuthority(role.getName()));
		}
		return new org.springframework.security.core.userdetails.User(internauteDAO.findByLogin(login).getLogin(), 
				internauteDAO.findByLogin(login).getPassword(), grantedAuthority);

	}

}
