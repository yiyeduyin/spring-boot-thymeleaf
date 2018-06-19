package com.c.springbootthymeleaf.dto.sys;

import java.io.Serializable;

public class SysGroupServiceItemDTO implements Serializable {
	private Integer id;
	
	//@ApiModelProperty(notes = "权限限制 1 只读 2 所有", required = true)
	private Integer permission;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}
}
