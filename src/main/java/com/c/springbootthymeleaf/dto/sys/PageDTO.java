package com.c.springbootthymeleaf.dto.sys;


import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;

public class PageDTO<T> implements Serializable{
	private static final long serialVersionUID = 80926525668946115L;
	private Long total;
	private List<T> items;
	public PageDTO(Page<T> page) {
		this.items = page.getContent();
		this.total = page.getTotalElements();
	}

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
