package com.c.springbootthymeleaf.dto.sys;

import com.c.springbootthymeleaf.domain.sys.SysUser;
import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

public class UserDetailsExtend implements UserDetails {
	private static final long serialVersionUID = -3519176234584564047L;
	
	private Set<GrantedAuthority> authorities;
    private String username;
    private String password;
    private AdminDetail adminDetail;

    public static UserDetailsExtend getUserDetail(SysUser sysUser, Boolean isAdmin) {
        UserDetailsExtend owner = new UserDetailsExtend();
        owner.username = sysUser.getUsername();
        owner.password = sysUser.getPassword();
        owner.authorities = Sets.newHashSet();
        AdminDetail adminDetail = new AdminDetail();
        adminDetail.setUserId(sysUser.getId());
        adminDetail.setUsername(sysUser.getUsername());
        adminDetail.setAdmin(isAdmin);
        owner.adminDetail = adminDetail;
        return owner;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	public AdminDetail getAdminDetail() {
		return adminDetail;
	}

	public void setAdminDetail(AdminDetail adminDetail) {
		this.adminDetail = adminDetail;
	}
}
