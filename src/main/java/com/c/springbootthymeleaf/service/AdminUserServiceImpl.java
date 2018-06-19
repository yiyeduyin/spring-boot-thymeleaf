package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.domain.sys.AdminUser;
import com.c.springbootthymeleaf.reposiritory.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	protected AdminUserRepository adminUserRepository;
	
	@Override
	public AdminUser findByUsername(String username) {
		return adminUserRepository.findByUsername(username);
	}

}
