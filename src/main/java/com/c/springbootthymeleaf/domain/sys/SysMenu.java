package com.c.springbootthymeleaf.domain.sys;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 菜单实体
 */
@Entity
@Table(name="t_sys_menu")
public class SysMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name="parent_id")
	private Integer parentId = 0;
	
	@Column(name="service_id")
	private String serviceId;

    /**
     * 是否公共菜单,1是,0否
     */
	@Column(name="is_public")
	private String isPublic;
	
	@Column(name="menu_name")
	private String menuName;
	
	@Column(name="menu_action")
	private String menuAction;
	
	@Column(name="description")
	private String description;
	
	@Column(name="menu_icon")
	private String menuIcon;

    /**
     * 菜单分组
     */
	@Column(name="menu_group")
	private Integer menuGroup;

	@Column(name="order_num")
	private Integer orderNum = 0;
	
	@Column(name="create_time")
	private Timestamp createTime;

    /**
     * 状态，0为禁用，1为正常
     */
	@Column(name="status")
	private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public Integer getMenuGroup() {
        return menuGroup;
    }

    public void setMenuGroup(Integer menuGroup) {
        this.menuGroup = menuGroup;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}