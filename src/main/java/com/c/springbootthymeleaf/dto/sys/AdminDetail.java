package com.c.springbootthymeleaf.dto.sys;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.List;

public class AdminDetail implements Serializable {
	private static final long serialVersionUID = 2400717170934748226L;
	private String username;
	@JsonProperty(value = "user_id")
	private Integer userId;
	@JsonProperty(value = "is_admin")
	private Boolean isAdmin;
	@JsonIgnore
	private List<Integer> actionIdList = Lists.newArrayList();
	@JsonIgnore
	private List<Integer> menuIdList = Lists.newArrayList();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public List<Integer> getActionIdList() {
        return actionIdList;
    }

    public void setActionIdList(List<Integer> actionIdList) {
        this.actionIdList = actionIdList;
    }

    public List<Integer> getMenuIdList() {
        return menuIdList;
    }

    public void setMenuIdList(List<Integer> menuIdList) {
        this.menuIdList = menuIdList;
    }
}
