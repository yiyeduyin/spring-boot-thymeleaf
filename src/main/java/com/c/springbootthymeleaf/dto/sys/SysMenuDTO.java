package com.c.springbootthymeleaf.dto.sys;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class SysMenuDTO implements Serializable {
	@JsonProperty(value = "menu_name")
	private String menuName;
	@JsonProperty(value = "menu_action")
	private String menuAction;
	@JsonProperty(value = "menu_icon")
	private String menuIcon;
	@JsonProperty(value = "children")
	private List<SysMenuDTO> children = null;

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuAction() {
		return menuAction;
	}

	public void setMenuAction(String menuAction) {
		this.menuAction = menuAction;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public List<SysMenuDTO> getChildren() {
		return children;
	}

	public void setChildren(List<SysMenuDTO> children) {
		this.children = children;
	}

	public SysMenuDTO(String menuName, String menuAction, String menuIcon, List<SysMenuDTO> children) {
		this.menuName = menuName;
		this.menuAction = menuAction;
		this.menuIcon = menuIcon;
		this.children = children;
	}

	public SysMenuDTO(String menuName, String menuAction, String menuIcon) {
		this.menuName = menuName;
		this.menuAction = menuAction;
		this.menuIcon = menuIcon;
	}
}
