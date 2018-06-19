package com.c.springbootthymeleaf.domain.sys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色服务关联实体
 */
@Entity
@Table(name="t_sys_group_service_xref")
public class SysGroupServiceXref implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name="group_id")
	private Integer groupId;

	@Column(name = "service_id")
	private Integer serviceId;

    /**
     * 1、只读权限 2、所有
     */
	@Column(name = "permission")
	private Integer permission;
	
	@Column(name="create_time")
	private Date createTime = new Date();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}