package com.c.springbootthymeleaf.dto.sys;

import java.io.Serializable;

public class SysUserPasswordDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
//	@ApiModelProperty(notes = "原来密码", required = true)
	private String oldPassword;
	
//	@ApiModelProperty(notes = "新密码", required = true)
	private String newPassword;
	
//	@ApiModelProperty(notes = "确认密码", required = true)
	private String confirmPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}