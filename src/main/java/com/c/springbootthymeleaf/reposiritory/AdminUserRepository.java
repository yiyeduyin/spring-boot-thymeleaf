package com.c.springbootthymeleaf.reposiritory;

import com.c.springbootthymeleaf.domain.sys.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends BaseRepository<AdminUser,Long>{

	AdminUser findByUsername(String username);

}