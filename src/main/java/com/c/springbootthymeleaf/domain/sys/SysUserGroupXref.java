package com.c.springbootthymeleaf.domain.sys;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户角色
 */
@Entity
@Table(name="t_sys_user_group_xref")
public class SysUserGroupXref implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name="group_id")
	private Integer groupId;

	@Column(name = "user_id")
	private Integer userId;
	
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}