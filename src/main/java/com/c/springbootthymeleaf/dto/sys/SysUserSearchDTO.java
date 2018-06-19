package com.c.springbootthymeleaf.dto.sys;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class SysUserSearchDTO implements Serializable {
	private String userName;
	private String nickName;
	@NotNull
    private Integer offset;
	@NotNull
    private Integer limit;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
}
