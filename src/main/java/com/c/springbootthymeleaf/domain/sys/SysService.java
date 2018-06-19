package com.c.springbootthymeleaf.domain.sys;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 服务
 */
@Entity
@Table(name="t_sys_service")
public class SysService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name="parent_id")
	private Integer parentId = 0;
	
	@Column(name="service_name")
	private String serviceName;

	@Column(name="service_code")
	private String serviceCode;
	
	@Column(name="service_icon")
	private String serviceIcon;
	
	@Column(name="is_admin")
	private Integer isAdmin;

	@Column(name="description")
	private String description;
	
	@Column(name="order_num")
	private Integer orderNum = 0;
	
	@Column(name="create_time")
	private Timestamp createTime;

	@Column(name="status")
	private Integer status = 1;

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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceIcon() {
        return serviceIcon;
    }

    public void setServiceIcon(String serviceIcon) {
        this.serviceIcon = serviceIcon;
    }

    public Integer getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Integer isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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