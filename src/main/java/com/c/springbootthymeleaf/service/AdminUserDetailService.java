package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.domain.sys.AdminUser;
import com.c.springbootthymeleaf.reposiritory.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminUserDetailService implements UserDetailsService {
	
	@Autowired
	private AdminUserRepository adminUserRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		AdminUser user = adminUserRepository.findByUsername(name);
		
		if(user == null){
			throw new UsernameNotFoundException("User details not found with this username: " + name);
		}
		
		String username = user.username;  
        String password = user.password;  
        String role = user.role; 
		
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        
        if (role != null && role.trim().length() > 0) {  
            if (role.equals("ADMIN")) {  
            	authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
            }  
        }  
        
		User userDetails = new User(username, password, authorities);
		
		return userDetails;
	}

}
