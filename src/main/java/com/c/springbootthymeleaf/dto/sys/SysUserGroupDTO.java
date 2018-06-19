package com.c.springbootthymeleaf.dto.sys;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SysUserGroupDTO implements Serializable {
	@JsonProperty(value = "group_id")
	private Integer groupId;
	@JsonProperty(value = "group_name")
	private String groupName;
	@JsonProperty(value = "is_enable")
	private Boolean isEnable;

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Boolean getEnable() {
		return isEnable;
	}

	public void setEnable(Boolean enable) {
		isEnable = enable;
	}

    public SysUserGroupDTO(Integer groupId, String groupName, Boolean isEnable) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.isEnable = isEnable;
    }
}
