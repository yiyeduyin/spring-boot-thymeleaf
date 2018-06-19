package com.c.springbootthymeleaf.service;

import com.c.springbootthymeleaf.dto.MenuConfig.*;

public interface MenuConfigService {

    CampaignMenuConfigDto getCampaignMenuConfig();

    CollectionMenuConfigDto getCollectionMenuConfig();

    IndexMenuConfigDto getIndexMenuConfig();

    PressMenuConfigDto getPressMenuConfig();

    ProjectMenuConfigDto getProjectMenuConfig();

    ShopMenuConfigDto getsShopMenuConfig();
}
