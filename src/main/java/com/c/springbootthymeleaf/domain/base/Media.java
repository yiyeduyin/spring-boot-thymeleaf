package com.c.springbootthymeleaf.domain.base;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 媒体
 */
@Entity
@Table(name = "t_media")
public class Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 归属Id
     */
    @Column(name = "belong_id")
    private Long belongId;

    /**
     * 归属类型（1 首页, 2 campaign页, 3 collection页, 4 porject页, 5 press页, 6 shop页, 7 e-shop页, 8 moreinfo页,）
     */
    @Column(name = "belong_type")
    private Integer belongType;

    /**
     * 链接类型 1图片，2视频
     */
    @Column(name = "type")
    private Integer linkType;

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

    public Long getBelongId() {
        return belongId;
    }

    public void setBelongId(Long belongId) {
        this.belongId = belongId;
    }

    public Integer getBelongType() {
        return belongType;
    }

    public void setBelongType(Integer belongType) {
        this.belongType = belongType;
    }

    public Integer getLinkType() {
        return linkType;
    }

    public void setLinkType(Integer linkType) {
        this.linkType = linkType;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
