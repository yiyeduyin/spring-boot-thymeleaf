package com.c.springbootthymeleaf.dto.MenuConfig;

import java.io.Serializable;
import java.util.List;

/**
 * shop
 */
public class ShopMenuConfigDto implements Serializable {

    /**
     * 菜单字体颜色
     */
    private String menuFontColour;

    /**
     * 背景图（字符串数组，逗号分割）
     */
    private List<String> backgroupPictures;

    public String getMenuFontColour() {
        return menuFontColour;
    }

    public void setMenuFontColour(String menuFontColour) {
        this.menuFontColour = menuFontColour;
    }

    public List<String> getBackgroupPictures() {
        return backgroupPictures;
    }

    public void setBackgroupPictures(List<String> backgroupPictures) {
        this.backgroupPictures = backgroupPictures;
    }
}
