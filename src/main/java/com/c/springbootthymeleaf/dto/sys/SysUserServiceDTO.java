package com.c.springbootthymeleaf.dto.sys;

import com.c.springbootthymeleaf.domain.sys.SysGroup;
import com.c.springbootthymeleaf.domain.sys.SysUser;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class SysUserServiceDTO implements Serializable {
	@JsonProperty(value = "sys_user")
//	@ApiModelProperty(notes = "用户数据", required = true)
	private SysUser sysUser;
	
	@JsonProperty(value = "group_list")
//	@ApiModelProperty(notes = "角色数据", required = true)
	private List<SysGroup> groupList;
	
	@JsonProperty(value = "service_list")
//	@ApiModelProperty(notes = "服务详细", required = true)
	private List<SysGroupServiceDTO> serviceList;

	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public List<SysGroup> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<SysGroup> groupList) {
		this.groupList = groupList;
	}

	public List<SysGroupServiceDTO> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<SysGroupServiceDTO> serviceList) {
		this.serviceList = serviceList;
	}
}
