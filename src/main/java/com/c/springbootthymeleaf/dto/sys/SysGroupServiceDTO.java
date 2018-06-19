package com.c.springbootthymeleaf.dto.sys;

import java.io.Serializable;
import java.util.List;

public class SysGroupServiceDTO implements Serializable {
	private Integer serviceId;
	
	private String serviceName;
	
	private String serviceIcon;
	
	private Boolean isEnable;
	
	private Integer permission;
	
	private List<SysGroupServiceDTO> children = null;

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceIcon() {
		return serviceIcon;
	}

	public void setServiceIcon(String serviceIcon) {
		this.serviceIcon = serviceIcon;
	}

	public Boolean getEnable() {
		return isEnable;
	}

	public void setEnable(Boolean enable) {
		isEnable = enable;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public List<SysGroupServiceDTO> getChildren() {
		return children;
	}

	public void setChildren(List<SysGroupServiceDTO> children) {
		this.children = children;
	}

	public SysGroupServiceDTO(Integer serviceId, String serviceName, String serviceIcon, Boolean isEnable, Integer permission) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceIcon = serviceIcon;
		this.isEnable = isEnable;
		this.permission = permission;
	}


}
