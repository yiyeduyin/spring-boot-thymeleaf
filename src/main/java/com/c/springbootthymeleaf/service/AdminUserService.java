package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.domain.sys.AdminUser;

public interface AdminUserService{

	AdminUser findByUsername(String username);
}
