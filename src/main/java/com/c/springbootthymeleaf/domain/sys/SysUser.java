package com.c.springbootthymeleaf.domain.sys;

import com.c.springbootthymeleaf.dto.sys.SysUserGroupDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 系统用户
 */
@Entity
@Table(name="t_sys_user")
public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "username")
	private String username;
	
	@JsonIgnore
	@Column(name = "password")
	private String password;

	@Column(name = "nick_name")
	private String nickName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "pic")
	private String pic;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "sex")
	private Integer sex;
	
	@Column(name="last_login_ip")
	private String lastLoginIp;

	@Column(name="last_login_time")
	private Date lastLoginTime;
	
	@Column(name="create_time")
	private Date createTime = new Date();
	
//	@ApiModelProperty(notes = "状态：0 禁用 1 可用 2 删除 ", required = true)
	@Column(name="status")
	private Integer status = 1;
	
	@Column(name="user_type")
//	@ApiModelProperty(notes = "类型，1为管理员，2为普通用户", required = true)
	private Integer userType = 0;
	
	@Transient
//	@ApiModelProperty(notes = "用户角色数据", required = true)
	private List<SysUserGroupDTO> list;
	
	@Transient
//	@ApiModelProperty(notes = "当前活动ID", required = true)
	private Integer activityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public List<SysUserGroupDTO> getList() {
        return list;
    }

    public void setList(List<SysUserGroupDTO> list) {
        this.list = list;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}