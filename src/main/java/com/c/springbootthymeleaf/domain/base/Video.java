package com.c.springbootthymeleaf.domain.base;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_video")
public class Video implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 链接
     */
    @Column(name = "link")
    private String link;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
