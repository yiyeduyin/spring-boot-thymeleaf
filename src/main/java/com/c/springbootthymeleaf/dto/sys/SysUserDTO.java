package com.c.springbootthymeleaf.dto.sys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysUserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
//	@ApiModelProperty(notes = "登录名称", required = true)
	private String username;
	
//	@ApiModelProperty(notes = "用户名称", required = true)
	private String nickName;
	
//	@ApiModelProperty(notes = "密码", required = true)
	private String password;
	
//	@ApiModelProperty(notes = "确认密码", required = true)
	private String confirmPassword;
	
	private String email;
	
	private String pic;
	
	private String mobile;
	
//	@ApiModelProperty(notes = "性别：0 未知  1 男 2 女  ", required = true)
	private Integer sex;
	
	private String lastLoginIp;
	
	private Date lastLoginTime;
	
//	@ApiModelProperty(notes = "用户角色数据", required = true)
	private List<Integer> groupIds;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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

	public List<Integer> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(List<Integer> groupIds) {
		this.groupIds = groupIds;
	}
}