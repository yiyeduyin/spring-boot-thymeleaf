package com.c.springbootthymeleaf.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * press
 */
@Entity
@Table(name = "t_press")
public class Press implements Serializable {

    private static final long serialVersionUID = -719995947047957874L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 菜单字体颜色
     */
    @Column(name = "menu_font_colour")
    private String menuFontColour;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuFontColour() {
        return menuFontColour;
    }

    public void setMenuFontColour(String menuFontColour) {
        this.menuFontColour = menuFontColour;
    }
}
