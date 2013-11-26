package com.briangorski.calendar.config;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.briangorski.calendar.dao.UserManager;
import com.briangorski.calendar.model.User;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	private UserManager _userManager;
	
	public CustomAuthenticationProvider() {
		// TODO Auto-generated constructor stub
	}
	
	protected final Logger logger = LoggerFactory.getLogger(CustomAuthenticationProvider.class);

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		
		try{
			User user = _userManager.getUserByUsername(authentication.getName());
			
			if (user != null) {
				List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				authorities.add(new SimpleGrantedAuthority("USER_ROLE"));
				UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(
						authentication.getName(), authentication.getCredentials(),
						authorities);
				return token;
			} else {
				return null;
			}
		}
		catch(Exception e){
			return null;
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}