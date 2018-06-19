package com.c.springbootthymeleaf.dto.sys;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class SysGroupSearchDTO implements Serializable {
	private String groupName;
	@NotNull
    private Integer offset;
	@NotNull
    private Integer limit;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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
