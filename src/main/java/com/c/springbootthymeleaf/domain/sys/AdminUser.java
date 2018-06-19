package com.c.springbootthymeleaf.domain.sys;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 管理员表
 * @author chenjiarong
 *
 */
@Entity
@Table(name = "t_user")
public class AdminUser implements Serializable {

	private static final long serialVersionUID = -719995947047957874L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;

	/**
	 * 用户名
	 */
	@Column(name = "username", nullable = false, unique = true)
	public String username;

	/**
	 * 密码
	 */
	@Column(name = "password", nullable = false)
	public String password;
	
	/**
	 * 角色
	 */
	@Column(name = "role", nullable = false)
	public String role;

	/**
	 * 是否可用
	 */
	@Column(name = "enabled", nullable = false)
	public Boolean enabled;
}
