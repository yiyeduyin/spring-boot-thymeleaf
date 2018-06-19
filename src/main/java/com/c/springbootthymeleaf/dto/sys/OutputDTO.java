package com.c.springbootthymeleaf.dto.sys;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OutputDTO<T extends Object> implements Serializable {

	@JsonProperty(value = "code")
	public Integer code  = 0 ;
	
	@JsonProperty(value = "message")
	public String message = "";
	
	@JsonProperty(value = "success")
	public Boolean success = true;
	
	public T result;
	/**
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public OutputDTO<T> fail(Integer code, String message) {
		this.code = code;
		this.success = false;
		this.message = message;
		return this;
	}
	
	/**
	 * 
	 * @param result
	 * @return
	 */
	public OutputDTO<T> success(T result) {
		this.result = result;
		return this;
	}

	public OutputDTO() {
	}
}
