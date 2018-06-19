package com.c.springbootthymeleaf.dto.sys;

import java.io.Serializable;
import java.util.List;

public class SysGroupDTO implements Serializable {
	private Integer groupId;
	
	private String groupName;
	
	private String description;
	
	private List<SysGroupServiceItemDTO> serviceItems;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SysGroupServiceItemDTO> getServiceItems() {
        return serviceItems;
    }

    public void setServiceItems(List<SysGroupServiceItemDTO> serviceItems) {
        this.serviceItems = serviceItems;
    }
}
