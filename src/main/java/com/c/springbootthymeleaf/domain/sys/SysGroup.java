package com.c.springbootthymeleaf.domain.sys;

import com.c.springbootthymeleaf.dto.sys.SysGroupServiceDTO;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 角色
 */
@Entity
@Table(name="t_sys_group")
public class SysGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name="group_name")
	private String groupName;

    /**
     * 类型，1为管理员，2为普通角色
     */
	@Column(name="group_type")
	private Integer groupType = 0;
	
	@Column(name="description")
	private String description;
	
	@Column(name="create_time")
	private Date createTime = new Date();

    /**
     * 状态，0为禁用，1为正常
     */
	@Column(name="status")
	private Integer status;

    /**
     * 服务详细
     */
	@Transient
	private List<SysGroupServiceDTO> list;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SysGroupServiceDTO> getList() {
        return list;
    }

    public void setList(List<SysGroupServiceDTO> list) {
        this.list = list;
    }
}